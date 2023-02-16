import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());

        dp = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;
        dp[1] = 1;
        fib(N);
        System.out.println(dp[N]);

    }

    static int fib(int n) {
        if (dp[n] != -1) return dp[n];
        return dp[n] = fib(n - 1) + fib(n - 2);
    }
}