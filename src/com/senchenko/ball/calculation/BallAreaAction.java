package com.senchenko.ball.calculation;

import com.senchenko.ball.entity.Ball;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * The class {@code BallAreaAction} contains method for calculating the ball area.
 * @author Denis Senchenko
 */
public class BallAreaAction {
    private static Logger logger = LogManager.getLogger();
    /**
     * @param ball is exemplar of class {@code Ball}.
     * @return the ball area.
     */

    public double calculateBallArea(Ball ball){
        /**
         * Reservation variable to store the ball area.
         */
        double ballArea;
        /**
         * Calculation of the area of the ball by the formula: S = 4 * π * R^2, and writing to a variable {@link ballArea}.
         */
        ballArea = 4 * Math.PI * (Math.pow(ball.getRadius(), 2));
        logger.log(Level.INFO, String.format("Area calculated for boll id = %d, area = %f", ball.getId(), ballArea));
        return ballArea;
    }
}
