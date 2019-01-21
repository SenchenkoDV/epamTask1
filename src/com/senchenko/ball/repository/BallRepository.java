package com.senchenko.ball.repository;

import com.senchenko.ball.exeption.BallException;
import com.senchenko.ball.entity.Ball;
import com.senchenko.ball.specification.Specification;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;

public enum BallRepository implements Repository {
    BALL_REPOSITORY;
    private static Logger logger = LogManager.getLogger();
    private List<Ball> ballRepository = new ArrayList<>();

    @Override
    public void addBall(Ball ball) {
        ballRepository.add(ball);
    }

    @Override
    public void removeBall(Ball ball) {
        ballRepository.remove(ball);
    }

    @Override
    public void updateBall(Ball ball) {
        ballRepository.set(ball.getId(), ball);
    }

    @Override
    public List getAll(Ball ball) {
        return ballRepository;
    }

    @Override
    public List query(Specification specification) {
        List<Ball> result = new ArrayList<>();
        try {
            if (ballRepository.isEmpty()) {
                throw new BallException("No items in repository");
            }
            for (Ball ball : ballRepository) {
                if (specification.specified(ball)) {
                    result.add(ball);
                }
            }
        } catch (BallException e) {
            logger.log(Level.ERROR, "Request returned ", result);
        }
        return result;
    }
}
