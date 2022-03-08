package fibonacciTest;

import fibonacci.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {
    /**
     * Test cases:
     * fibonacci 0 -> 0
     * fibonacci 1 -> 0
     * fibonacci 2 -> 1
     * fibonacci 3 -> 2
     * fibonacci 10 -> 55
     * fibonacci 46 -> 1836311903
     * fibonacci (< 0) -> IllegalArgumentException
     * fibonacci (> 47) -> IllegalArgumentException
     **/

    private Fibonacci fib;

    @BeforeEach
    public void init() {
        fib = new Fibonacci();
    }

    @AfterEach
    public void finish() {
        fib = null;
    }

    @Test
    public void compute_ArgumentIsZero_ReturnZero(){
        int expectedValue = 0;
        int obtainedValue = fib.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void compute_ArgumentIsOne_ReturnOne(){
        int expectedValue = 1;
        int obtainedValue = fib.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void compute_ArgumentIsTwo_ReturnOne(){
        int expectedValue = 1;
        int obtainedValue = fib.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void compute_ArgumentIsThree_ReturnTwo(){
        int expectedValue = 2;
        int obtainedValue = fib.compute(3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void compute_ArgumentIsTen_Return55(){
        int expectedValue = 55;
        int obtainedValue = fib.compute(10);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void compute_ArgumentIsANegativeNumber_RaiseAnIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> fib.compute(-1));
    }

    @Test
    public void compute_ArgumentIs46_Return1836311903(){
        int expectedValue = 1836311903;
        int obtainedValue = fib.compute(46);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void compute_ArgumentIsGreaterThan46_RaiseAnIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> fib.compute(47));
    }

}
