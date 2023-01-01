import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long S = Long.parseLong(br.readLine());
        int N = 0;
        long sum = 0;
        int i = 1;
        while (true){
            sum += i;
            if (sum > S){
                break;
            }
            N++;
            i++;
        }
        System.out.println(N);
    }
}