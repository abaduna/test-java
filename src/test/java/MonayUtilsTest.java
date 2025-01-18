import org.example.MoneyUtils;
import org.junit.Assert;
import org.junit.Test;

public class MonayUtilsTest {
    @Test
    public void moneyTest(){
        String money = MoneyUtils.format(1000.00);
        Assert.assertEquals("$1000.00",money);
    }
    @Test
    public void NagativemoneyTest(){
        String money = MoneyUtils.format(-1000.00);
        Assert.assertEquals("-$1000.00",money);
    }
    @Test
    public void euroMoneyTest(){
        String money = MoneyUtils.fomat(1000.00,"€");
        Assert.assertEquals("€1000.00",money);
    }
    @Test
    public void euroNagativeMoneyTest(){
        String money = MoneyUtils.fomat(-1000.00,"€");
        Assert.assertEquals("-€1000.00",money);
    }

    @Test(expected = IllegalArgumentException.class)
    public void valueNullMoneyTest(){
        MoneyUtils.fomat(-1000.00,null);

    }
}
