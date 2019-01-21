package com.senchenko.ball.specification;

import com.senchenko.ball.entity.Ball;

public class BallSpecificationFindBallByCoordinates implements Specification {
    private double x;
    private double y;
    private double z;

    public BallSpecificationFindBallByCoordinates(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean specified(Ball ball) {
        return (x == ball.getCenterPoint().getX()) &
                (y == ball.getCenterPoint().getY()) &
                (z == ball.getCenterPoint().getZ());
    }
}
