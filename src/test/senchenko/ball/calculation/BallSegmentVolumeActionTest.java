package test.senchenko.ball.calculation;

import com.senchenko.ball.calculation.BallSegmentVolumeAction;
import com.senchenko.ball.entity.Ball;
import com.senchenko.ball.entity.Point;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BallSegmentVolumeActionTest {
    BallSegmentVolumeAction ballSegmentVolumeAction;
    Point testPoint;
    Ball testBall;
    @BeforeClass
    public void setUp(){
        ballSegmentVolumeAction = new BallSegmentVolumeAction();
        testPoint= new Point(1,"Test Point",1,1,1);
        testBall = new Ball(1, "Test Ball", testPoint, 3);
    }
    @AfterClass
    public void tierDown(){
        ballSegmentVolumeAction = null;
        testPoint = null;
        testBall = null;
    }
    @Test
    public void calculateBallSegmentVolumePositiveTest(){
        double expected = 29.32153;
        double actual = ballSegmentVolumeAction.calculateBallSegmentVolume(2,testBall);
        Assert.assertEquals(expected,actual,0.0001);
    }
    @Test
    public void calculateBallSegmentVolumeNegativeTest(){
        double expected = 29.32153;
        double actual = ballSegmentVolumeAction.calculateBallSegmentVolume(1,testBall);
        Assert.assertNotEquals(expected,actual,0.0001);
    }
    @Test
    public void calculateBallSegmentWrongHeightTest(){
        double expected = 0;
        double actual = ballSegmentVolumeAction.calculateBallSegmentVolume(6,testBall);
        Assert.assertEquals(expected,actual,0.0001);
    }
}
