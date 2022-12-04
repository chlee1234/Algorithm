import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            stack.push(K);
        }
        int standard = stack.pop();
        int cnt = 1;
        int current = 0;
        while (!stack.isEmpty()) {
            current = stack.pop();
            if (current > standard) {
                standard = current;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
