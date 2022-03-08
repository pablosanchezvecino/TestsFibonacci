package fibonacci;

public class Fibonacci {

    public int compute(int n) {
        if (n < 0 || n > 46) throw new IllegalArgumentException("El argumento no puede ser negativo");
        if (n <= 1) return n;

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        return sum;
    }


}
