package com.java_master.exception;

import lombok.Getter;

@Getter
public class InvalidGameException extends Exception {
    private String message;

    public InvalidGameException(String message) {
        this.message = message;
    }

}