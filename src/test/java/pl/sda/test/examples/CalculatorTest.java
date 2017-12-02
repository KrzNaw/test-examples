package pl.sda.test.examples;


import Calculator.CalculatorImpl;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    CalculatorImpl calc = new CalculatorImpl();

    @Test
    public void testAdd() {
        // given
        int a = 1;
        int b = 2;


        // when
        int c = calc.add(a,b);

        // then
        Assert.assertEquals("1+2=4", c, 3);
    }

    @Test
    public void testSub() {

        double a = 19.9;
        double b = 11.9;

        double c = calc.sub(a,b);

        Assert.assertEquals("19.9-11.9=8.0", c,8.0, 0.01);//delta - z jaką dokładnoścą badamy wynik

    }

    @Test
    public void testMulti() {
        int a = 5;
        int b = 5;

        int c = calc.multi(a,b);

        Assert.assertEquals("5*5 = 25", c, 25);

    }

    @Test
    public void testDivide() {
        int a = 30;
        int b = 6;

        int c = calc.divide(a,b);

        Assert.assertEquals("30/6=5", c, 5);

    }

}
