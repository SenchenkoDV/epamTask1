package test.senchenko.ball.parser;

import com.senchenko.ball.parser.BallParser;
import com.senchenko.ball.validation.Validator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BallParserTest {
    List<List<String>> testData;
    String testLine;
    List<String> testList;
    Validator testValidator;
    @BeforeClass
    public void setUp(){
        testLine = "5.6 634";
        testValidator = line -> line.equals("5.6 634");
        testData = new ArrayList<>();
        testList = new ArrayList<>();
        testData.add(new ArrayList<>(Arrays.asList(testLine.split(" "))));
        testList.add(testLine);
    }
    @AfterClass
    public void tierDown(){
        testData = null;
        testList = null;
        testLine = null;
        testValidator = null;
    }
    @Test
    public void parseValidDateForEntityTest(){
        List<List<String>> expected = testData;
        List<List<String>> actual = BallParser.parseValidDateForEntity(testList,testValidator);
        Assert.assertEquals(actual,expected);
    }
}
