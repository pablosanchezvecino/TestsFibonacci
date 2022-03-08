package fibonacciTest;

import fibonacci.Fibonacci;
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
     * fibonacci 92 -> 7540113804746346429
     * fibonacci (< 0) -> IllegalArgumentException
     * fibonacci (> 92) -> IllegalArgumentException
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
        long expectedValue = 0;
        long obtainedValue = fib.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void compute_ArgumentIsOne_ReturnOne(){
        long expectedValue = 1;
        long obtainedValue = fib.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void compute_ArgumentIsTwo_ReturnOne(){
        int expectedValue = 1;
        long obtainedValue = fib.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void compute_ArgumentIsThree_ReturnTwo(){
        long expectedValue = 2;
        long obtainedValue = fib.compute(3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void compute_ArgumentIsTen_Return55(){
        long expectedValue = 55;
        long obtainedValue = fib.compute(10);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void compute_ArgumentIs92_Return7540113804746346429(){
        long expectedValue = 7540113804746346429L;
        long obtainedValue = fib.compute(92);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void compute_ArgumentIsANegativeNumber_RaiseAnIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> fib.compute(-1));
    }

    @Test
    public void compute_ArgumentIsGreaterThan92_RaiseAnIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> fib.compute(93));
    }

}
