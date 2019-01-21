package test.senchenko.ball.сheck;

import com.senchenko.ball.check.IntersectionAccesCheck;
import com.senchenko.ball.entity.Ball;
import com.senchenko.ball.entity.Point;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IntersectionAccesCheckTest {
    Point testPoint;
    Point testPoint2;
    Ball testBall;
    Ball testBall2;
    @BeforeClass
    public void setUp(){
        testPoint= new Point(1,"Test Point",0,1,1);
        testPoint2= new Point(2,"Test Point",1,1,1);
        testBall = new Ball(1, "Test Ball", testPoint, 2);
        testBall2 = new Ball(2, "Test Ball2", testPoint2, 2);
    }
    @AfterClass
    public void tierDown(){
        testPoint = null;
        testBall = null;
        testBall2 = null;
        testPoint2 = null;
    }

    @Test
    public void intersectionAccesCheckPositiveTest(){
        boolean expected = true;
        boolean actual = IntersectionAccesCheck.intersectionAccesCheck(testBall);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void intersectionAccesCheckNegativeTest(){
        boolean expected = false;
        boolean actual = IntersectionAccesCheck.intersectionAccesCheck(testBall2);
        Assert.assertNotEquals(expected,actual);
    }
}
