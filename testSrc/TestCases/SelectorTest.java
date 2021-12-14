package TestCases;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.sc.uliyanov_n_s.Selector;
import ru.vsu.sc.uliyanov_n_s.Utils.ListUtils;
import java.io.FileNotFoundException;
import java.util.List;

public class SelectorTest {
    Selector selector = new Selector();

    @Test
    public void testSelector1() throws FileNotFoundException {
        List<List<String>> input = ListUtils.loadStringList2FromFile("testSrc/TestCases/testsForSelector1.txt");
        int placesValue = 6;
        List<List<String>> output = ListUtils.loadStringList2FromFile("testSrc/TestCases/answerForSelector1.txt");

        assert input != null;
        List<List<String>> testResult = selector.selectEntrant(input, placesValue);

        Assert.assertEquals(output, testResult);
    }

    @Test
    public void testSelector2() throws FileNotFoundException {
        List<List<String>> input = ListUtils.loadStringList2FromFile("testSrc/TestCases/testsForSelector2.txt");
        int placesValue = 8;
        List<List<String>> expectedResult = ListUtils.loadStringList2FromFile("testSrc/TestCases/answerForSelector2.txt");

        assert input != null;
        List<List<String>> testResult = selector.selectEntrant(input, placesValue);

        Assert.assertEquals(expectedResult, testResult);
    }

    @Test
    public void testSelector3() throws FileNotFoundException {
        List<List<String>> input = ListUtils.loadStringList2FromFile("testSrc/TestCases/testsForSelector3.txt");
        int placesValue = 3;
        List<List<String>> expectedResult = ListUtils.loadStringList2FromFile("testSrc/TestCases/answerForSelector3.txt");

        assert input != null;
        List<List<String>> testResult = selector.selectEntrant(input, placesValue);

        Assert.assertEquals(expectedResult, testResult);
    }

    @Test
    public void testSelector4() throws FileNotFoundException {
        List<List<String>> input = ListUtils.loadStringList2FromFile("testSrc/TestCases/testsForSelector4.txt");
        int placesValue = 9;
        List<List<String>> expectedResult = ListUtils.loadStringList2FromFile("testSrc/TestCases/answerForSelector4.txt");

        assert input != null;
        List<List<String>> testResult = selector.selectEntrant(input, placesValue);

        Assert.assertEquals(expectedResult, testResult);
    }

    @Test
    public void testSelector5() throws FileNotFoundException {
        List<List<String>> input = ListUtils.loadStringList2FromFile("testSrc/TestCases/testsForSelector5.txt");
        int placesValue = 10;
        List<List<String>> expectedResult = ListUtils.loadStringList2FromFile("testSrc/TestCases/answerForSelector5.txt");

        assert input != null;
        List<List<String>> testResult = selector.selectEntrant(input, placesValue);

        Assert.assertEquals(expectedResult, testResult);
    }
}
