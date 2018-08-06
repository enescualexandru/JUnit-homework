package calculateMax;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculateMaxTest {
    CalculateMax calculateMax = new CalculateMax();
    @Before
    public void beforeMethod() {
        System.out.println("Before Method");
    }
    @Test
    public void getMaxABigger() {
        Assert.assertEquals(calculateMax.getMax(3, 2), 3);
    }
    @Test
    public void getMaxEquals() {

        Assert.assertEquals(calculateMax.getMax(3, 3), 3);
    }
    @Test
    public void getMaxAMinus() {

        Assert.assertEquals(calculateMax.getMax(-3, 3), 3);
    }
    @Test
    public void getMaxBothMinus() {

        Assert.assertEquals(calculateMax.getMax(-3, -3), -3);
    }

    @Test
    public void getMaxBBiggest() {

        Assert.assertEquals(calculateMax.getMax(0, 2), 2);
    }
}
