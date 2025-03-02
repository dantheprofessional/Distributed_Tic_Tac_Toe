package com.javamaster.storage;

import com.javamaster.model.Game;

import java.util.Map;

public class GameStorage {

    private static Map<String, Game> game;
    private static GameStorage instance;

    private GameStorage(){

    }

}
