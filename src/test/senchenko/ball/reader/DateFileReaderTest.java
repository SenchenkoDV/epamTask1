package test.senchenko.ball.reader;

import com.senchenko.ball.exeption.BallException;
import com.senchenko.ball.reader.DateFileReader;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DateFileReaderTest {
    String transmittedPath;
    String dataFromDefaultFile;
    List<String> expectedList;
    @BeforeClass
    public void setUp(){
        transmittedPath = "input/input2.txt";
        expectedList = new ArrayList<>();
        dataFromDefaultFile = "5.3 5 5.6 5.6";
        expectedList.add(dataFromDefaultFile);
    }
    @AfterClass
    public void tierDown(){
        transmittedPath = null;
        dataFromDefaultFile = null;
        expectedList = null;
    }
    @Test
    public void readDefaultPassTest() throws BallException {
        List<String> expected = expectedList;
        List<String> actual = DateFileReader.read(transmittedPath);
        Assert.assertEquals(actual,expected);
    }
}
