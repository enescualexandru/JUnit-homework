package conversion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConversionTest {
    Conversion conversion = new Conversion();
    @Before
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void getCelsiusZeroDeg() {
        Assert.assertEquals(conversion.getCelsius(0),-17.7778,0.1);
    }

    @Test
    public void getCelsiusNegDeg() {
        Assert.assertEquals(conversion.getCelsius(-10),-23.3333,0.1);
    }

    @Test
    public void getCelsiusPozDeg() {
        Assert.assertEquals(conversion.getCelsius(10),-12.2222,0.1);
    }

    @Test
    public void getCelsiusNorDeg() {
        Assert.assertEquals(conversion.getCelsius(98),36.6667,0.1);
    }

    @Test
    public void getCelsiusOneDecimal() {
        Assert.assertEquals(conversion.getCelsius(100.1),37.833333,0.1);
    }

    @Test
    public void getCelsiusTwoDecimal() {
        Assert.assertEquals(conversion.getCelsius(100.16),37.8666667,0.1);
    }

}
