import java.lang.Exception;

public class Main {
    public static int fibonacci(int n) throws Exception {
        if(n <= 0) {
            throw new Exception("O input deve ser 1 ou maior.");
        }
        if(n < 3) {
            return n - 1;
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void pertence_a_sequencia_fibonacci(int n) throws Exception {
        for(int i = 1;;i++) {
            int fib = fibonacci(i);
            if(fib > n) {
                System.out.println(n + " não pertence a sequência fibonacci.");
                break;
            }
            if(fib == n) {
                System.out.println(n + " pertence a sequência fibonacci.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            try {
                pertence_a_sequencia_fibonacci(i);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}