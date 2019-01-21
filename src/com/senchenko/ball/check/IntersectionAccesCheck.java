package com.senchenko.ball.check;

import com.senchenko.ball.entity.Ball;

public class IntersectionAccesCheck {

    public static boolean intersectionAccesCheck(Ball ball) {
        return ((((ball.getCenterPoint().getX() - ball.getRadius()) <= 0)) ||
                (((ball.getCenterPoint().getY() - ball.getRadius()) <= 0)) ||
                (((ball.getCenterPoint().getZ() - ball.getRadius()) <= 0))) == true ? true : false;
    }
}
