package com.javamaster.model;

import lombok.Data;

@Data
public class Game {
    private String gameId;
    private Player player1;
    private Player player2;
    private GameStatus status;
    private int [][] board;
    private TicTacToe winner;


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

    /**
     * @return Player return the player1
     */
    public Player getPlayer1() {
        return player1;
    }

    /**
     * @param player1 the player1 to set
     */
    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    /**
     * @return Player return the player2
     */
    public Player getPlayer2() {
        return player2;
    }

    /**
     * @param player2 the player2 to set
     */
    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    /**
     * @return GameStatus return the status
     */
    public GameStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(GameStatus status) {
        this.status = status;
    }

    /**
     * @return int [][] return the board
     */
    public int [][] getBoard() {
        return board;
    }

    /**
     * @param board the board to set
     */
    public void setBoard(int [][] board) {
        this.board = board;
    }

    /**
     * @return TicTacToe return the winner
     */
    public TicTacToe getWinner() {
        return winner;
    }

    /**
     * @param winner the winner to set
     */
    public void setWinner(TicTacToe winner) {
        this.winner = winner;
    }

}
