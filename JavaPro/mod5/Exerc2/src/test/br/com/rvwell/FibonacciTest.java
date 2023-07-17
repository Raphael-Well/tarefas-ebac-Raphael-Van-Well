package br.com.rvwell;

import org.junit.jupiter.api.Test;

import static br.com.rvwell.Fibonacci.fibonacci;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    public void testFibonacci() {
        assertEquals(0, fibonacci(0));
        assertEquals(1, fibonacci(1));
        assertEquals(1, fibonacci(2));
        assertEquals(2, fibonacci(3));
        assertEquals(3, fibonacci(4));
        assertEquals(5, fibonacci(5));
        assertEquals(8, fibonacci(6));
        assertEquals(13, fibonacci(7));
        assertEquals(21, fibonacci(8));
        assertEquals(34, fibonacci(9));
    }
}
