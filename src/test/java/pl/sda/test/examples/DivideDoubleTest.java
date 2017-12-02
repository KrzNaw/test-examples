package pl.sda.test.examples;

import Calculator.Calculator;
import Calculator.CalculatorImpl;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DivideDoubleTest {

    private CalculatorImpl calc;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    //rula oczekuje, że wyjątków nie ma

    @Before
    public void before(){
        calc = new CalculatorImpl();
    }

    @Test
    public void testDivideWithZero(){
        //given
        int a = 2;
        int b = 0;
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("ZERO");

        //when
        calc.divide(a,b);

        //then


    }
}
