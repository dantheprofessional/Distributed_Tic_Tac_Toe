package com.javamaster.model;

import lombok.Data;

@Data
public class GamePlay {

    private TicTacToe type;
    private Integer coordinateX;
    private Integer coordinateY;
    private String gameId;

    public GamePlay(Integer coordinateX, Integer coordinateY, String gameId, TicTacToe type) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.gameId = gameId;
        this.type = type;
    }


    /**
     * @return TicTacToe return the type
     */
    public TicTacToe getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(TicTacToe type) {
        this.type = type;
    }

    /**
     * @return Integer return the coordinateX
     */
    public Integer getCoordinateX() {
        return coordinateX;
    }

    /**
     * @param coordinateX the coordinateX to set
     */
    public void setCoordinateX(Integer coordinateX) {
        this.coordinateX = coordinateX;
    }

    /**
     * @return Integer return the coordinateY
     */
    public Integer getCoordinateY() {
        return coordinateY;
    }

    /**
     * @param coordinateY the coordinateY to set
     */
    public void setCoordinateY(Integer coordinateY) {
        this.coordinateY = coordinateY;
    }

    /**
     * @return String return the gameId
     */
    public String getGameId() {
        return gameId;
    }

    /**
     * @param gameId the gameId to set
     */
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

}
