package pl.sda.test.examples;


import Calculator.CalculatorImpl;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DivDoubleTest {
    private CalculatorImpl calc;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void before() {
        calc = new CalculatorImpl();
    }

    @Test
    public void testDoubleDivByZero() {
        Double a = 18.0;
        Double b = 2.0;

        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("ZERO");

        calc.div(a, b);
    }

    @Test
    public void testNullFirstArgument() {
        Double a = null;
        Double b = 9.0;

        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("nullem");

        calc.div(a, b);

    }

    @Test
    public void testNullSecondArgument(){
        Double a = 12.0;
        Double b = null;

        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("");

        calc.div(a,b);


    }
}
