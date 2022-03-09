package fibonacci;

/**
 * Contiene el método <code>{@link Fibonacci#compute(int) compute(int n)}</code>
 * para calcular el n-ésimo término de la sucesión de Fibonacci.
 */
public class Fibonacci {
    /**
     * Calcula el n-ésimo término de la sucesión de Fibonacci de forma iterativa
     * y utilizando variables de tipo <code>long</code>.
     * @param n indica que se quiere calcular el n-ésimo término de la sucesión.
     * @return el n-ésimo término de la sucesión.
     * @throws IllegalArgumentException Si n es negativo o causa desbordamiento (n > 92).
     */
    public long compute(int n) {
        if (n < 0 || n > 92) throw new IllegalArgumentException("El argumento no puede ser negativo " +
                                                                "ni mayor que 92 (causaría desbordamiento)");
        if (n <= 1) return n;

        long num1 = 0;
        long num2 = 1;
        long sum = 0;

        for (int i = 1; i < n; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        return sum;
    }

}
