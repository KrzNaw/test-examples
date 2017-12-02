package pl.sda.test.examples;

import Calculator.CalculatorImpl;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedFromFileTest {

    private CalculatorImpl calc = new CalculatorImpl();

    @Test
    @FileParameters(value = "src/test/test.csv")
    public void testAddFile(int a, int b, int c){//trzeba podać parametry do metody
        assertEquals(c, calc.add(a,b));//wywołanie parametrów metody
    }


}
