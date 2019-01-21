package com.senchenko.ball.calculation;

import com.senchenko.ball.entity.Ball;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The class {@code BallVolumeAction} contains method for calculating the ball volume.
 * @author Denis Senchenko
 */
public class BallVolumeAction {
    private static Logger logger = LogManager.getLogger();
    /**
     * @param ball is exemplar of class {@code Ball}.
     * @return the ball volume.
     */

    public double calculateBallVolume(Ball ball){
        /**
         * Reservation variable to store the ball volume.
         */
        double ballVolume;
        /**
         * Calculation of the volume of the ball by the formula: S = 4/3 * π * R^3,
         * and writing to a variable {@link ballVolume}.
         */
        ballVolume = (4* Math.PI * (Math.pow(ball.getRadius(), 3))/3) ;
        logger.log(Level.INFO, String.format("Volume calculated for boll id = %d, volume = %f", ball.getId(), ballVolume));
        return ballVolume;
    }
}
