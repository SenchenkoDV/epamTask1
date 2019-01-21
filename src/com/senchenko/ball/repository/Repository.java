package com.senchenko.ball.repository;

import com.senchenko.ball.entity.Ball;
import com.senchenko.ball.specification.Specification;
import java.util.List;

public interface Repository {
    void addBall(Ball ball);
    void removeBall(Ball ball);
    void updateBall(Ball ball);
    List<Ball> getAll(Ball ball);
    List<Ball> query(Specification specification);
}
