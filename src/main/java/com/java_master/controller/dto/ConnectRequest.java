package com.java_master.controller.dto;

import com.java_master.model.Player;
import lombok.Data;

@Data
public class ConnectRequest {
    private Player player;
    private String gameId;
}