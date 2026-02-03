package Task3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void divide_correctDivision() {
        // AAA Pattern
        Calculator calculator = new Calculator();

        double result = calculator.divide(10, 2);
        // assert
        assertEquals(5, result);
    }

    @Test
    void divide_divisionByZero_throwsException() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
