package com.javamaster.controller;

import com.javamaster.model.Game;
import com.javamaster.service.GameService;
import com.javamaster.model.Player;

import com.javamaster.controller.dto.ConnectRequest;  // Adjust the package path accordingly

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.messaging.simp.SimpMessagingTemplate;

import com.javamaster.controller.dto.ConnectRequest;




@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/game")
public class GameController {

    private final GameService gameService;
    private final SimpMessagingTemplate simpleMessagingTemplate;

    @PostMapping("/start")
    public ResponseEntity<Game> start(@RequestBody Player player){
        log.info("start game request: {}", player);
        return ResponseEntity.ok(gameService.createGame(player));

    }

    @PostMapping("/connect")
    public ResponseEntity<Game> connect(@RequestBody ConnectRequest request) throws InvalidParamException, InvalidGameException{
        log.info("connect request: {}", request);
        return ResponseEntity.ok(gameService.connectToGame(request.getPlayer(), request.getGameId()));
    }

    @PostMapping("/connect/random")
    public ResponseEntity<Game> connectRandom(@RequestBody Player player){
        log.info("connect random {}", player);
        return ResponseEntity.ok(gameService.connectToRandomGame(player));
    }
        @PostMapping("/gameplay")
        public ResponseEntity<Game> gamePlay(@RequestBody GamePlay request){
          log.info("gameplay: {}". request);
          Game game = gameService.gamePlay(request);
          simpleMessagingTemplate.convertAndSend("/topic/game-progress" + game.getGameId(), game);
          return ResponseEntity.ok(game);
        
        }

}
