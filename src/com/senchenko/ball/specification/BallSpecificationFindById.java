package com.senchenko.ball.specification;

import com.senchenko.ball.entity.Ball;

public class BallSpecificationFindById implements Specification {
    private int id;

    public BallSpecificationFindById(int id) {
        this.id = id;
    }

    @Override
    public boolean specified(Ball ball) {
        return id == ball.getId();
    }
}
