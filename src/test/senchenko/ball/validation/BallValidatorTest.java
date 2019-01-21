package test.senchenko.ball.validation;

import com.senchenko.ball.validation.BallValidator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BallValidatorTest {
    String correctLine;
    String incorrectLine;
    @BeforeClass
    public void setUp(){
        correctLine = "5.3 5 5.6 5.6";
        incorrectLine = "2 3 2 -5";
    }
    @AfterClass
    public void tierDown(){
        correctLine = null;
        incorrectLine = null;
    }
    @Test
    public void lineValidationCheckPositiveTest(){
        boolean expected = true;
        boolean actual = BallValidator.lineValidationCheck(correctLine);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void lineValidationCheckNegativeTest(){
        boolean expected = true;
        boolean actual = BallValidator.lineValidationCheck(incorrectLine);
        Assert.assertNotEquals(actual,expected);
    }
}
