package com.senchenko.ball.repository;

import com.senchenko.ball.entity.Ball;
import java.util.Comparator;

public class BallComparator {
    public static Comparator<Ball> sortById() {
        return Comparator.comparingInt(Ball::getId);
    }

    public static Comparator<Ball> sortByName() {
        return Comparator.comparing(Ball::getName);
    }

    public static Comparator<Ball> sortByRadius() {
        return Comparator.comparingDouble(Ball::getRadius);
    }

    public static Comparator<Ball> sortByCenterX() {
        return (Ball o1, Ball o2) -> (int) (o1.getCenterPoint().getX() - o2.getCenterPoint().getX());
    }

    public static Comparator<Ball> sortByCenterY() {
        return (Ball o1, Ball o2) -> (int) (o1.getCenterPoint().getY() - o2.getCenterPoint().getY());
    }

    public static Comparator<Ball> sortByCenterZ() {
        return (Ball o1, Ball o2) -> (int) (o1.getCenterPoint().getZ() - o2.getCenterPoint().getZ());
    }
    
}
