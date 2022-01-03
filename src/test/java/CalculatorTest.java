import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int expected = 0;
        int actual = calculator.add();
        assertEquals(expected,actual);
    }

    @Test
    void testAdd1() {
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.add(5);
        assertEquals(expected, actual);
    }

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int expected = 4;
        int actual = calculator.add(1,1);
        assertEquals(expected,actual);
    }




}