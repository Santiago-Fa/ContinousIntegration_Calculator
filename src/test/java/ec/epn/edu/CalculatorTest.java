package ec.epn.edu;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;
    @Before
    public void setUp(){
        System.out.println("setUpClass");
        calculator = new Calculator();
    }

    //testPotenciacion
    @Test
    public void given_two_numbers_when_power_then_ok() {
        System.out.println("Test 1");
        int expected = 15625;
        int actual = calculator.power(5, 6);
        assertEquals(expected, actual);
    }

    //Test raiz
    @Test
    public void given_two_numbers_when_root_then_ok() {
        System.out.println("Test 2");
        double expected = 3;
        double actual = calculator.root(27, 3);
        assertEquals(expected, actual, 0.001);
    }
    //Test resta
    @Test
    public void given_two_integers_when_substraction_then_ok(){
        System.out.println("Test 3");
        int expected = 0;
        int actual = calculator.substract(4,4);
        assertEquals(expected, actual);
    }

    //Test division
    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_split_then_ok(){
        System.out.println("Test 4");
        int expected = 0;
        int actual = calculator.split(8,0);
        assertEquals(expected, actual);
    }

    //Test suma
    @Test
    public void given_two_numbers_when_addition_then_ok() {
        Calculator calculator = new Calculator();
        double expected = 16;
        double actual = calculator.addition(11, 5);
        assertEquals(expected, actual, 0.001);
    }

    //Test mutiplicacion
    @Test
    public void given_two_numbers_when_multiplication_then_ok() {
        Calculator calculator = new Calculator();
        double expected = 20;
        double actual = calculator.multiplication(4, 5);
        assertEquals(expected, actual, 0.001);
    }

}