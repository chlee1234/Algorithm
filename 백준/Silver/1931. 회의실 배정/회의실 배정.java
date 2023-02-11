import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] A = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            A[i][0] = Integer.parseInt(st.nextToken());
            A[i][1] = Integer.parseInt(st.nextToken());
        }
        // 종료시간 순으로 정렬
        Arrays.sort(A, (o1, o2) -> {
            if (o1[1] == o2[1]) {   // 종료시간이 같을 때
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        int cnt = 0;
        int end = -1;
        for (int i = 0; i < N; i++) {
            if (A[i][0] >= end) {  // 겹치지 않는 다음 회의가 나온 경우
                end = A[i][1];  // 종료 시간 업데이트 하기
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

