import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int cntfib = 0;
    public static int cntfibonacci = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        fib(N);
        fibonacci(N);
        System.out.println(cntfib + " " + cntfibonacci);
    }
    public static int fib (int n){
        if (n == 1 || n == 2) {
            cntfib++;
            return 1;
        }
        else return (fib(n - 1) + fib(n - 2));
    }
    public static int fibonacci (int n){
        int[] fibonacciArr = new int[n + 1];
        fibonacciArr[1] = fibonacciArr[2] = 1;
        for (int i = 3; i <= n; i++) {
            cntfibonacci++;
            fibonacciArr[i] = fibonacciArr[i - 1] + fibonacciArr[i - 2];
        }
        return fibonacciArr[n];
    }
}
