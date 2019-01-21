package test.senchenko.ball.calculation;

import com.senchenko.ball.calculation.BallVolumeAction;
import com.senchenko.ball.entity.Ball;
import com.senchenko.ball.entity.Point;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BallVolumeActionTest {
    BallVolumeAction ballVolumeAction;
    Point testPoint;
    Ball testBall;
    @BeforeClass
    public void setUp(){
        ballVolumeAction = new BallVolumeAction();
        testPoint= new Point(1,"Test Point",1,1,1);
        testBall = new Ball(1, "Test Ball", testPoint, 2);
    }
    @AfterClass
    public void tierDown(){
        ballVolumeAction = null;
        testPoint = null;
        testBall = null;
    }
    @Test
    public void calculateBallVolumePositiveTest(){
        double expected = 33.51032;
        double actual = ballVolumeAction.calculateBallVolume(testBall);
        Assert.assertEquals(expected,actual,0.0001);
    }
    @Test
    public void calculateBallVolumeNegativeTest(){
        double expected = 43.51032;
        double actual = ballVolumeAction.calculateBallVolume(testBall);
        Assert.assertNotEquals(expected,actual,0.0001);
    }
}
