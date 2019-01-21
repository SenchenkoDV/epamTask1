package com.senchenko.ball.util;

public class GenerateId {
    private static int id = 1;
    public static int generateIdForBall(){
        return id++;
    }
}
