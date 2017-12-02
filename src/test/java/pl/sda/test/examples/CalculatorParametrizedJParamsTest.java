package pl.sda.test.examples;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedJParamsTest {

    /*@Test
    @Parameterized.Parameters({
            "1, 1, 2",
            "2, 2, 4"
    })
    public void testAdd(int numberA, int numberB, int expected) {
        assertEquals(expected, numberA + numberB);
    }*/
}

