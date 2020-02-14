package se.lexicon.robin;

import static org.junit.Assert.*;
import static se.lexicon.robin.Calculator.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public static double number1;
    public static double number2;
    public static double expected;
    public static double actual;
    @Test
    public void testAdditionBasic(){
        number1 = 20;
        number2 = 25;
        expected = 45;

        actual = addition(number1,number2);

        assertEquals(expected,actual,0.2);
    }

    @Test
    public void testAdditionNegative(){
        number1 = 5;
        number2 = -50;
        expected = -45;

        actual = addition(number1,number2);

        assertEquals(expected,actual,0.2);
    }

    @Test
    public void testAdditionZero(){
        number1 = 40;
        number2 = 0;
        expected = 40;

        actual = addition(number1,number2);

        assertEquals(expected,actual,0.2);
    }

    @Test
    public void testSubtractionBasic(){
        number1 = 55;
        number2 = 25;
        expected = 30;

        actual = subtraction(number1,number2);

        assertEquals(expected,actual,0.2);
    }

    @Test
    public void testSubtractionNegative(){
        number1 = 50;
        number2 = -30;
        expected = 80;

        actual = subtraction(number1,number2);

        assertEquals(expected,actual,0.2);
    }

    @Test
    public void testSubtractionTwoNegative(){
        number1 = -50;
        number2 = -30;
        expected = -20;

        actual = subtraction(number1,number2);

        assertEquals(expected,actual,0.2);
    }

    @Test
    public void testSubtractionZero(){
        number1 = 42;
        number2 = 0;
        expected = 42;

        actual = subtraction(number1, number2);

        assertEquals(expected,actual,0.2);
    }

    @Test
    public void testMultiplierBasic(){
        number1 = 10;
        number2 = 6;
        expected = 60;

        actual = multiplier(number1,number2);

        assertEquals(expected,actual,0.2);
    }
    @Test
    public void testMultiplierNegative(){
        number1 = -5;
        number2 = 100;
        expected = -500;

        actual = multiplier(number1,number2);

        assertEquals(expected,actual,0.2);
    }

    @Test
    public void testMultiplierZero(){
        number1 = 25;
        number2 = 0;
        expected = 0;

        actual = multiplier(number1,number2);

        assertEquals(expected,actual,0.2);
    }

    @Test
    public void testDivisionBasic(){
        number1 = 50;
        number2 = 10;
        expected = 5;

        actual = divide(number1,number2);

        assertEquals(expected,actual,0.2);
    }

    @Test
    public void testDivisionPositiveZero(){
        number1 = 5;
        number2 = 0;
        expected = Double.POSITIVE_INFINITY;

        actual = divide(number1,number2);

        assertEquals(expected,actual,0.2);
    }

    @Test
    public void testDivisionNegativeZero(){
        number1 = -10;
        number2 = 0;
        expected = Double.NEGATIVE_INFINITY;

        actual = divide(number1, number2);

        assertEquals(expected,actual,0.2);
    }

    @Test
    public void testDivisionZero(){
        number1 = 0;
        number2 = 10;
        expected = 0;

        actual = divide(number1,number2);

        assertEquals(expected,actual,0.2);
    }

}
