package br.com.rvwell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {
    @Test
    public void testAdicionar() {
        assertEquals(3, new Calculadora().adicionar(1, 2));
        assertEquals(5, new Calculadora().adicionar(2, 3));
        assertEquals(7, new Calculadora().adicionar(3, 4));
    }

    @Test
    public void testSubtrair() {
        assertEquals(-1, new Calculadora().subtrair(2, 3));
        assertEquals(-2, new Calculadora().subtrair(3, 5));
        assertEquals(-3, new Calculadora().subtrair(4, 7));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(2, new Calculadora().multiplicar(1, 2));
        assertEquals(6, new Calculadora().multiplicar(2, 3));
        assertEquals(12, new Calculadora().multiplicar(3, 4));
    }

    @Test
    public void testDividir() {
        assertEquals(2, new Calculadora().dividir(4, 2));
        assertEquals(3, new Calculadora().dividir(6, 2));
        assertEquals(4, new Calculadora().dividir(8, 2));
    }

    @Test
    public void testDividirPorZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            new Calculadora().dividir(1, 0);
        });
        assertEquals("Divisão por zero", exception.getMessage());
    }
}
