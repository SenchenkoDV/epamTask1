package com.senchenko.ball.check;

import com.senchenko.ball.entity.Ball;

public class BallCheck {

    public static boolean ballCheckByRadius(Ball ball){
        return (ball.getRadius() > 0);
    }
}
