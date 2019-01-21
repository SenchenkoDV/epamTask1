package com.senchenko.ball.specification;

import com.senchenko.ball.entity.Ball;

public class BallSpecificationFindBallInRange implements Specification {
    private double x;
    private double y;
    private double z;

    public BallSpecificationFindBallInRange(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean specified(Ball ball) {
        return (x > (ball.getCenterPoint().getX() + ball.getRadius())) &
                (y > (ball.getCenterPoint().getY() + ball.getRadius())) &
                (z > (ball.getCenterPoint().getZ() + ball.getRadius()));
    }
}
