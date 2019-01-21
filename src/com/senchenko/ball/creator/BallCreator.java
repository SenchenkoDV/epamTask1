package com.senchenko.ball.creator;

import com.senchenko.ball.entity.Ball;
import com.senchenko.ball.entity.Point;
import com.senchenko.ball.util.GenerateId;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BallCreator {
    private static final String POINT_NAME_PREFIX = "Point ";
    private static final String BALL_NAME_PREFIX = "Ball ";
    private List<Ball> listOfBalls = new ArrayList<>();

    public List<Ball> createBalls(List<List<String>> data) {
        ListIterator<List<String>> iterator = data.listIterator();
        while (iterator.hasNext()) {
            int id = GenerateId.generateIdForBall();
            List<String> element = iterator.next();
            listOfBalls.add(
                    new Ball(
                            id,
                            BALL_NAME_PREFIX + String.valueOf(id),
                            new Point(id,
                                    POINT_NAME_PREFIX + String.valueOf(id),
                                    Double.parseDouble(element.get(0)),
                                    Double.parseDouble(element.get(1)),
                                    Double.parseDouble(element.get(2))),
                            Double.parseDouble(element.get(3))
                    )
            );
        }
        return listOfBalls;
    }
}
