package fibonacci;

public class Fibonacci {

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

    public static void main(String[] args) {
        System.out.println(new Fibonacci().compute(92));
    }

}
