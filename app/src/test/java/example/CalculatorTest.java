package example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void setup() {
        calculator = new Calculator();
    }
    @Test
    public void testAddBasic() {
        Assert.assertEquals(5, calculator.add(2, 3));
    }
    @Test
    public void testMinusBasic() {
        Assert.assertEquals(15, calculator.minus(20, 5));
    }
    @Test
    public void testMultiplyBasic() {
        Assert.assertEquals(16, calculator.multiply(2, 8));
    }
    @Test
    public void testDivideBasic() {
        Assert.assertEquals(10, calculator.divide(20, 2), 0.5);
    }
}
