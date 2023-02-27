import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());

        int[] ball = new int[N];
        for (int i = 0; i < N; i++) {
            ball[i] = i + 1;
        }

        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int temp = ball[i - 1];
            ball[i - 1] = ball[j - 1];
            ball[j - 1] = temp;
        }
        for (int i : ball) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}