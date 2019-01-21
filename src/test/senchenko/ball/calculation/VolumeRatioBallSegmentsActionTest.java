package test.senchenko.ball.calculation;

import com.senchenko.ball.calculation.VolumeRatioBallSegmentsAction;
import com.senchenko.ball.entity.Ball;
import com.senchenko.ball.entity.Point;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VolumeRatioBallSegmentsActionTest {
    VolumeRatioBallSegmentsAction volumeRatioBallSegmentsAction;
    Point testPoint;
    Ball testBall;
    @BeforeClass
    public void setUp(){
        volumeRatioBallSegmentsAction = new VolumeRatioBallSegmentsAction();
        testPoint= new Point(1,"Test Point",1,1,1);
        testBall = new Ball(1, "Test Ball", testPoint, 3);
    }
    @AfterClass
    public void tierDown(){
        volumeRatioBallSegmentsAction = null;
        testPoint = null;
        testBall = null;
    }
    @Test
    public void calculatePositiveTest(){
        double expected = 2.85714;
        double actual = volumeRatioBallSegmentsAction.calculateVolumeRatioBallSegments(2,testBall);
        Assert.assertEquals(expected,actual,0.0001);
    }
    @Test
    public void calculateNegativeTest(){
        double expected = 3.85714;
        double actual = volumeRatioBallSegmentsAction.calculateVolumeRatioBallSegments(2,testBall);
        Assert.assertNotEquals(expected,actual,0.0001);
    }
}
