package test.senchenko.ball.calculation;

import com.senchenko.ball.calculation.BallAreaAction;
import com.senchenko.ball.entity.Ball;
import com.senchenko.ball.entity.Point;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class BallAreaActionTest {
    BallAreaAction ballAreaAction;
    Point testPoint;
    Ball testBall;
    @BeforeClass
    public void setUp(){
        ballAreaAction = new BallAreaAction();
        testPoint= new Point(1,"Test Point",1,1,1);
        testBall = new Ball(1, "Test Ball", testPoint, 2);
    }
    @AfterClass
    public void tierDown(){
        ballAreaAction = null;
        testPoint = null;
        testBall = null;
    }
    @Test
    public void calculateBallAreaPositiveTest(){
        double expected = 50.265472;
        double actual = ballAreaAction.calculateBallArea(testBall);
        Assert.assertEquals(expected,actual,0.0001);
    }
    @Test
    public void calculateBallAreaNegativeTest(){
        double expected = 40.265472;
        double actual = ballAreaAction.calculateBallArea(testBall);
        Assert.assertNotEquals(expected,actual,0.0001);
    }
}
