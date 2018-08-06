package dataValidation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DataValidationTest {
    DataValidation dataValidation = new DataValidation();
    @Before
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void validateTimeZeroes() {
        Assert.assertTrue(dataValidation.validateTime(0,0));
    }

    @Test
    public void validateBothPoz() {
        Assert.assertTrue(dataValidation.validateTime(1,1));
    }

    @Test
    public void validateTimeNegatives() {
        Assert.assertFalse(dataValidation.validateTime(-1,-1));
    }

    @Test
    public void validateTimeNegHour() {
        Assert.assertFalse(dataValidation.validateTime(-1,1));
    }

    @Test
    public void validateTimeNegMin() {
        Assert.assertFalse(dataValidation.validateTime(1,-1));
    }
    @Test
    public void validateTimeHourTwoFour() {
        Assert.assertFalse(dataValidation.validateTime(24,1));
    }
    @Test
    public void validateTimeHourTwenyFive() {
        Assert.assertFalse(dataValidation.validateTime(25,1));
    }
    @Test
    public void validateTimeMinuteSixy() {
        Assert.assertFalse(dataValidation.validateTime(1,60));
    }
    @Test
    public void validateTimeMinuteSixtyOne() {
        Assert.assertFalse(dataValidation.validateTime(1,61));
    }
    @Test
    public void formatTimeFourDigits() {
       Assert.assertEquals(dataValidation.formatTime(10,10),"1010");
    }
    @Test
    public void formatTimeHourSmaller() {
        Assert.assertEquals(dataValidation.formatTime(1,10),"0110");
    }
    @Test
    public void formatTimeMinuteSmall() {
        Assert.assertEquals(dataValidation.formatTime(10,1),"1001");
    }
    @Test
    public void formatTimeBothSmaller() {
        Assert.assertEquals(dataValidation.formatTime(1,1),"0101");
    }
}

