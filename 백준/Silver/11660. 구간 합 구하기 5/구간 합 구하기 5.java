import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());  // 표의 크기
        int M = Integer.parseInt(st.nextToken());  // 합을 구해야하는 횟수

        int[][] A = new int[N+1][N+1];
        for (int i = 1; i <= N; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
            for (int j = 1; j <= N; j++){
                A[i][j] = Integer.parseInt(st1.nextToken());
            }
        }
        int[][] sum = new int[N+1][N+1];
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= N; j++){
                sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + A[i][j]; // 구간 합 구하기
            }
        }
        for (int i = 0; i < M; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
            int x1 = Integer.parseInt(st2.nextToken());
            int y1 = Integer.parseInt(st2.nextToken());
            int x2 = Integer.parseInt(st2.nextToken());
            int y2 = Integer.parseInt(st2.nextToken());
            int result = sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1-1] + sum[x1-1][y1-1];
            System.out.println(result);
        }
    }
}