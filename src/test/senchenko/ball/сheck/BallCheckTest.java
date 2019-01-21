package test.senchenko.ball.сheck;

import com.senchenko.ball.check.BallCheck;
import com.senchenko.ball.entity.Ball;
import com.senchenko.ball.entity.Point;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BallCheckTest {
    Point testPoint;
    Ball testBall;
    Ball testBall2;
    @BeforeClass
    public void setUp(){
        testPoint= new Point(1,"Test Point",1,1,1);
        testBall = new Ball(1, "Test Ball", testPoint, 2);
        testBall2 = new Ball(1, "Test Ball", testPoint, -2);
    }
    @AfterClass
    public void tierDown(){
        testPoint = null;
        testBall = null;
        testBall2 = null;
    }
    @Test
    public void ballCheckByRadiusPositiveTest(){
        boolean expected = true;
        boolean actual = BallCheck.ballCheckByRadius(testBall);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void ballCheckByRadiusNegativeTest(){
        boolean expected = true;
        boolean actual = BallCheck.ballCheckByRadius(testBall2);
        Assert.assertNotEquals(expected,actual);
    }
}
