import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int A = 0;
        int B = 0;
        int room = 0;

        for (int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine()," ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            if (N % H == 0){
                A = H * 100;
                B = N / H;
            } else {
                A = (N % H) * 100;
                B = (N / H) + 1;
            }
            room = A + B;
            sb.append(room).append('\n');
        }

        System.out.println(sb);
    }
}