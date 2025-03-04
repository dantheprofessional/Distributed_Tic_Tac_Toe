package com.javamaster.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter 
public enum TicTacToe {
    X(value:1),O(value:2);

    private Integer value
   
}
