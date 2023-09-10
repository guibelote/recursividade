package factorialdecinco;

public class factorialdecinco {

    public static void main(String[] args) {
        int n = 5;
        int factorialResulto = factorial(n);
        System.out.println("Fatorial de " + n + " é: " + factorialResulto);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
