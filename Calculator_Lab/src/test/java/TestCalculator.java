import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(3, 3);
    }

    @Test
    public void calculatorCanAdd(){
        assertEquals(6, calculator.add());

    }

    @Test
    public void CalculatorCanSubtract(){
        assertEquals(0, calculator.subtract());
    }

    @Test
    public void CalculatorCanMultiply(){
        assertEquals(9, calculator.multiply());
    }

    @Test
    public void CalculatorCanDivide(){
        assertEquals(1, calculator.divide());
    }

}
