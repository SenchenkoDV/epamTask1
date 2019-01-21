package com.senchenko.ball.entity;

import com.senchenko.ball.observer.BallObserver;

public class Ball {

    private int id;
    private String name;
    private Point centerPoint;
    private double radius;

    public Ball(int id, String name, Point centerPoint, double radius) {
        this.id = id;
        this.name = name;
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        notifyObserver();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (id != ball.id) return false;
        if (Double.compare(ball.radius, radius) != 0) return false;
        if (name != null ? !name.equals(ball.name) : ball.name != null) return false;
        return centerPoint != null ? centerPoint.equals(ball.centerPoint) : ball.centerPoint == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (centerPoint != null ? centerPoint.hashCode() : 0);
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", centerPoint=" + centerPoint +
                ", radius=" + radius +
                '}';
    }

    private void notifyObserver(){
        BallObserver.changeValue(this);
    }
}
