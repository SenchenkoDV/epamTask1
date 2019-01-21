package com.senchenko.ball.exeption;

public class BallException extends Exception{
    public BallException() {
    }

    public BallException(String message) {
        super(message);
    }

    public BallException(String message, Throwable cause) {
        super(message, cause);
    }

    public BallException(Throwable cause) {
        super(cause);
    }
}
