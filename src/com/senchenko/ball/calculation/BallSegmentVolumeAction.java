package com.senchenko.ball.calculation;

import com.senchenko.ball.entity.Ball;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * The class {@code BallSegmentVolumeAction} contains method for calculating the ball segment volume.
 * @author Denis Senchenko
 */
public class BallSegmentVolumeAction {
    private static Logger logger = LogManager.getLogger();
    /**
     * Calculates segment area by segment height at section
     * @param heightSegment is segment height obtained after cutting a sphere.
     * @param ball is ball that cut through.
     * @return the ball segment volume. Return 0 if segment height
     * is greater than the diameter of the ball.
     */

    public double calculateBallSegmentVolume(double heightSegment, Ball ball){
        /**
         * Reservation variable to store the ball segment volume.
         */
        double ballSegmentVolume;
        /**
         * Calculation of the volume of the ball's segment by the formula: V = (п*h^2)/3 * (3^r - h),
         * and writing to a variable {@link ballSegmentVolume}.
         */
        if (heightSegment < (ball.getRadius()*2)){
            ballSegmentVolume = (Math.PI * Math.pow(heightSegment, 2))/3 * (3 * ball.getRadius() - heightSegment);
            logger.log(Level.INFO, String.format("Volume of segment calculated for boll id = %d, volume = %f",
                    ball.getId(), ballSegmentVolume));
            return ballSegmentVolume;
        }else {
            return 0;
        }
    }
}
