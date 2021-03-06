package pl.sda.test.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorManuallyParametrizedTest {
    @Test  // metoda testowa sprawdzająca wiele przypadków
    public void addingNumbersPositiveNumbers() {
        assertAddingNumbers(1, 1, 2);
        assertAddingNumbers(0, 0, 0);
        assertAddingNumbers(-1, -1, -2);
    }

    // metoda zawierające logikę testu
    private void assertAddingNumbers(int first, int second, int expected) {
        assertEquals(expected, first + second);
    }

}
