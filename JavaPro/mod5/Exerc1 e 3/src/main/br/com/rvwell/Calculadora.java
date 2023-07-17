package br.com.rvwell;

/**
 * A classe `Calculadora` fornece métodos para realizar operações aritméticas básicas.
 *
 * @author Bard
 */
public class Calculadora {

    /**
     * Calcula a soma de dois números.
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return A soma dos dois números.
     */
    public int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Calcula a diferença entre dois números.
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return A diferença entre os dois números.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Calcula o produto de dois números.
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return O produto dos dois números.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Calcula o quociente de dois números.
     *
     * @param a O dividendo.
     * @param b O divisor.
     * @return O quociente dos dois números.
     * @throws ArithmeticException Se o divisor for zero.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return a / b;
    }

}
