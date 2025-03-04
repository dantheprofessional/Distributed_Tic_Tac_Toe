package com.javamaster.storage;

import java.util.HashMap;

import com.javamaster.model.Game;

import java.util.Map;

public class GameStorage {

    private static Map<String, Game> games;
    private static GameStorage instance;

    private GameStorage(){

        games = new HashMap<>();

    }

    public static  GameStorage getInstance(){
        if(instance==null){
            instance = new GameStorage();
        }

        return instance;
    }
    public Map<String, Game> getGames() {
                return games; 
    }

     public void setGame(Game game ){
            
            games.put(game.getGameId(),game);


     }
    

}
