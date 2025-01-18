import org.example.MoneyUtils;
import org.example.TTD;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class testDrivenDevelopment {

    /*
    private FizzBuzz game
    *@Before
    * public void befere(){
    * game = new FizzBuss
    * }
    *
    *
    * */
    @Test
    public void shouldReturnNunbers(){
       List<String> numberList = TTD.pshisAndBus();
        Assert.assertEquals("1",numberList.get(0));
    }
    @Test
    public void shouldReturnNunbersMultpleOfTheThree(){
        List<String> numberList = TTD.pshisAndBus();
        Assert.assertEquals("fiiz",numberList.get(2));
    }
    @Test
    public void shouldReturnNunbersMultpleOfTheFive(){
        List<String> numberList = TTD.pshisAndBus();
        Assert.assertEquals("buz",numberList.get(4));
    }
    @Test
    public void shouldReturnNunbersMultpleOfTheFiveAndThree(){
        List<String> numberList = TTD.pshisAndBus();
        Assert.assertEquals("fiizBuz",numberList.get(14));
    }
}
