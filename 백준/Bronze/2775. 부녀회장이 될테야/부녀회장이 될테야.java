import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] APT = new int[15][15];
        for (int i = 0; i < 15; i++) {
            APT[0][i] = i;   // 0층 i호
            APT[i][1] = 1;   // i층 1호
        }
        for (int i = 1; i < 15; i++) { // 1층부터 14층까지

            for (int j = 2; j < 15; j++) {  // 2층부터 14호까지
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }
        for (int i = 0; i < T; i++){
            int k = Integer.parseInt(br.readLine());   // k층
            int n = Integer.parseInt(br.readLine());   // n호
            System.out.println(APT[k][n]);
        }
    }
}