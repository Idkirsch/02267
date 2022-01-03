import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAddZero() {
        Calculator calculator = new Calculator();
        int expected = 0;
        int actual = calculator.add("");
        assertEquals(expected,actual);
    }

    @Test
    void testAddOne() {
        Calculator calculator = new Calculator();
        int expected = 4;
        int actual = calculator.add("4");
        assertEquals(expected,actual);
    }

    @Test
    void testAddTwo() {
        Calculator calculator = new Calculator();
        int expected = 7;
        int actual = calculator.add("4,3");
        assertEquals(expected,actual);
    }

    @Test
    void testAddMultiple() {
        Calculator calculator = new Calculator();
        int expected = 20;
        int actual = calculator.add("4,3,3,5,3,2");
        assertEquals(expected,actual);
    }

    @Test
    void testAddNewLine() {
        Calculator calculator = new Calculator();
        int expected = 6;
        int actual = calculator.add("2\r\n2\r\n2");
        assertEquals(expected,actual);
    }

    @Test
    void testAddNewLineOrComma() {
        Calculator calculator = new Calculator();
        int expected = 6;
        int actual = calculator.add("2\r\n2,2");
        assertEquals(expected,actual);
    }

    @Test
    void testAddNewDelimiter() {
        Calculator calculator = new Calculator();
        int expected = 3;
        int actual = calculator.add("//;\n1;2");
        assertEquals(expected,actual);
    }

}