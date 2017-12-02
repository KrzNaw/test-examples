package pl.sda.test.examples;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // given
        int a = 1;
        int b = 2;

        // when
        int c = a + b;

        // then
        Assert.assertEquals("1+2=4", c, 3);
    }

    @Test
    public void testSub(){

        double a = 19.9;
        double b = 11.9;

        double c = a - b;

        Assert.assertEquals(c, 8, 8);

    }

    @Test
    public void testMulti(){
        int a = 5;
        int b = 5;

        int c = 5 * 5;



    }

    @Test
    public void testDivide(){

    }

}
