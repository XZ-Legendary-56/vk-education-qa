import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        // First test
        int expected1 = 25;
        int result1 = calculator.add(10, 15);
        assertEquals(expected1, result1);

        // Second test
        int expected2 = 150;
        int result2 = calculator.add(100, 50);
        assertEquals(expected2, result2);
    }
}