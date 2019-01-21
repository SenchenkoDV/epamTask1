package com.senchenko.ball.calculation;

import com.senchenko.ball.entity.Ball;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VolumeRatioBallSegmentsAction {
    private static Logger logger = LogManager.getLogger();
    /**
     * @param heightSegment
     * @param ball
     * @return 0 if segment height is greater than the diameter of the ball.
     */

    public double calculateVolumeRatioBallSegments(double heightSegment, Ball ball){
        BallSegmentVolumeAction ballSegmentVolumeAction = new BallSegmentVolumeAction();
        if (heightSegment < (ball.getRadius()*2)){
            double heightSegment2 = ball.getRadius()*2 - heightSegment;
            double segment1 = ballSegmentVolumeAction.calculateBallSegmentVolume(heightSegment, ball);
            double segment2 = ballSegmentVolumeAction.calculateBallSegmentVolume(heightSegment2, ball);
            double volumeRatioBallSegments = segment2/segment1;
            logger.log(Level.INFO, String.format("Segment ratio boll id = %d, area = %f",
                    ball.getId(), volumeRatioBallSegments));
            return volumeRatioBallSegments;
        }else {
            logger.log(Level.INFO, String.format("Transferred segment height = %f greater than the diameter of the ball id = %d",
                    heightSegment, ball.getId()));
            return 0;
        }
    }
}
