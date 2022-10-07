import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = N;
        int cnt = 0;
        br.close();

        while (true) {
            int a = N / 10;
            int b = N % 10;
            int temp = a + b;
            N = b * 10 + temp % 10;
            cnt++;
            if(N == num){
                break;
            }
        }
        System.out.println(cnt);
    }
}