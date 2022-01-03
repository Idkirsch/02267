import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int expected = 10;
        int actual = calculator.add("1,1,1,1,6");
        assertEquals(expected,actual);
    }


}