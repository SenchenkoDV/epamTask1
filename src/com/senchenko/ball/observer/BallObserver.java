package com.senchenko.ball.observer;

import com.senchenko.ball.calculation.BallAreaAction;
import com.senchenko.ball.calculation.BallVolumeAction;
import com.senchenko.ball.entity.Ball;

public class BallObserver {
    public static void changeValue(Ball ball){
        BallParameters ballParameters = new BallParameters(
                new BallAreaAction().calculateBallArea(ball),
                new BallVolumeAction().calculateBallVolume(ball)
        );
        Warehouse.updateParameters(ball.getId(),ballParameters);
    }
}
