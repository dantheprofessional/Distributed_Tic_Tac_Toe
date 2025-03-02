package com.javamaster.service;
import com.javamaster.storage.GameStorage;
import com.javamaster.model.Game;
import com.javamaster.model.GameStatus;
import com.javamaster.model.Player;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GameService {

    public Game createGame{Player player}{
        Game game = new Game();
        game.setBoard{new int [3][3]};
        game.setGameId{UUID.randomUUID().toString()};
        game.setPlayer1(player);
        game.setStatus(NEW);
        GameStorage.getInstance().setGame(game);
        return game;
    }

    public Game connectToGame(Player player2. String gameId) throws InvalidParamException, InvalidGameException{
        if(GameStorage.getInstance().getGames().containsKey(gameId)){
            throw new InvalidParamException("Game with provided id doesn't exist ");
        }

        Game game = GameStorage.getInstance().getGames().get(gameId);

        if(game.getPlayer2() != null){
            throw new InvalidGameException("Game is not valid anymore");

        }

        game.setPlayer2(player2);
        game.setStatus(IN_PROGRESS);
        GameStorage.getInstance().setGame(game);
        return game;

    }

    public Game connectToRandomGame(Player player2) throws NotFoundException {
         Game game = GameStorage.getInstance().getGames().values().stream()
         .filter(it=>it.getStatus().equals(NEW))
         .findFirst().orElseThrow()=> new NotFoundException("Game not found"); 
        game.setPlayer2(player2);
        game.setStatus(IN_PROGRESS);
        GameStorage.getInstance().setGame(game);
        return game;

    }

    public Game gamePlay(GamePlay gamePlay){

        if(GameStorage.getInstance().getGames().containsKey(gamePlay.getGameId())){
            trow new NotFoundException("Game not found");
        }

        Game game = GameStorage.getInstance().getGames().get(gamePlay.getGameId());
        if(game.getStatus().equals(FINISHED)){
            throw new InvalidGameException("Game is already finished");
        }

        int [][] board = game.getBoard();
        board[gamePlay.getCoordinateX()][gamePlay.getCoordinateY()] = gamePlay.getType().getValue();

        checkWinner(game.getBoard(), TicTacToe.X);
        checkWinner(game.getBoard(), TicTacToe.O);


        return game;

        private Boolean checkWinner(int[][] boardc, TicTacToe o) {

        }

    }

}
