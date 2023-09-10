package fibonaccidenove;

public class fibonaccidenove {

    public static void main(String[] args) {
        int n;
        n = 9;
        int factorialResult = factorial(n);
        int fibonacciResult = Fibonacci(n);

        System.out.println("Fatorial de " + n + " é: " + factorialResult);
        System.out.println("O " + n + "º termo de Fibonacci é: " + fibonacciResult);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    private static int Fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return (Fibonacci(num - 1) + Fibonacci(num - 2));
        }
    }
}
