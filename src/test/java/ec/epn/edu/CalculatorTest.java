package ec.epn.edu;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    //testPotenciacion
    @Test
    public void given_two_numbers_when_power_then_ok() {
        Calculator calculator = new Calculator();
        int expected = 15625;
        int actual = calculator.power(5, 6);
        assertEquals(expected, actual);
    }

    //Test raiz
    @Test
    public void given_two_numbers_when_root_then_ok() {
        Calculator calculator = new Calculator();
        double expected = 3;
        double actual = calculator.root(27, 3);
        assertEquals(expected, actual, 0.001);
    }

}