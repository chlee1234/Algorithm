import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        int start_idx = 1;
        int end_idx = 1;
        int sum = 1;

        while (end_idx != N) {
            if (sum == N) {
                cnt++;
                end_idx++;
                sum = sum + end_idx;
            } else if (sum > N) {
                sum = sum - start_idx;
                start_idx++;
            } else {
                end_idx++;
                sum = sum + end_idx;
            }
        }
        System.out.println(cnt);
    }
}