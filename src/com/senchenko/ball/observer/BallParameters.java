package com.senchenko.ball.observer;

public class BallParameters {
    private double ballArea;
    private double ballVolume;

    public BallParameters(double ballArea, double ballVolume) {
        this.ballArea = ballArea;
        this.ballVolume = ballVolume;
    }

    public double getBallArea() {
        return ballArea;
    }

    public double getBallVolume() {
        return ballVolume;
    }

    public void setBallArea(double ballArea) {
        this.ballArea = ballArea;
    }

    public void setBallVolume(double ballVolume) {
        this.ballVolume = ballVolume;
    }
}
