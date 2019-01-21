package com.senchenko.ball.specification;

import com.senchenko.ball.entity.Ball;

public class BallSpecificationFindBallByName implements Specification {
    private String name;

    public BallSpecificationFindBallByName(String name) {
        this.name = name;
    }

    @Override
    public boolean specified(Ball ball) {
        return name == ball.getName();
    }
}
