package com.javamaster.model;

public enum TicTacToe {
    X(1), O(2);

    private final int value;

    TicTacToe(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
