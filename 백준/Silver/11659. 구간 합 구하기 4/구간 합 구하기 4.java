import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] sum = new long[N+1];
        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
        for (int i = 1; i <= N; i++){
            sum[i] = sum[i-1] + Integer.parseInt(st1.nextToken());
        }
        for (int i = 0; i < M; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            System.out.println(sum[b] - sum[a-1]);
        }
    }
}