package com.senchenko.ball.observer;

import com.senchenko.ball.entity.Ball;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class Warehouse {
    private static Logger logger = LogManager.getLogger();
    private static HashMap<Integer,BallParameters> ballWarehouse = new HashMap<>();

    public void addBallParameters(int id, BallParameters ballParameters){
        ballWarehouse.put(id, ballParameters);
    }

    public static void updateParameters(int id, BallParameters ballParameters){
        if (ballWarehouse.containsKey(id)){
            ballWarehouse.replace(id, ballParameters);
            logger.log(Level.INFO,
                    String.format("Parameters with id = %d were updated successfully.", id));
        }else {
            ballWarehouse.put(id, ballParameters);
            logger.log(Level.INFO,
                    String.format("There is not saved parameters in Warehouse with following id: %d. " +
                                    "Were add parameters with id = %d: Area = %f, Volume = %f",
                    id, id, ballParameters.getBallArea(),ballParameters.getBallVolume()));
        }
    }
}
