package be.intecbrussel.Moderate;

public class FibonacciNumber {
    public Integer fibonacci(Integer n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
