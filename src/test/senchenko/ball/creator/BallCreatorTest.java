package test.senchenko.ball.creator;

import com.senchenko.ball.creator.BallCreator;
import com.senchenko.ball.entity.Ball;
import com.senchenko.ball.entity.Point;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BallCreatorTest {
    BallCreator ballCreator;
    String testBall;
    Ball expectedBall;
    List<List<String>> testData;
    List<Ball> expectedList;
    @BeforeClass
    public void setUp(){
        testBall = "5.3 5 5.6 5.6";
        testData = new ArrayList<>();
        ballCreator = new BallCreator();
        testData.add(new ArrayList<>(Arrays.asList(testBall.split(" "))));
        expectedBall = new Ball(1, "Ball 1", new Point(1,"Point 1", 5.3, 5, 5.6), 5.6);
        expectedList = new ArrayList<Ball>();
        expectedList.add(expectedBall);
    }
    @AfterClass
    public void tierDown(){
        testData = null;
        testBall = null;
        ballCreator = null;
        expectedBall = null;
        expectedList = null;
    }
    @Test
    public void createBallsTest(){
        List<Ball> expected = expectedList;
        List<Ball> actual = ballCreator.createBalls(testData);
        Assert.assertEquals(expected,actual);
    }
}
