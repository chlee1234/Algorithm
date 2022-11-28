import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());  // 테스트 케이스
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int choX = Integer.parseInt(st.nextToken());
            int choY = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int baekX = Integer.parseInt(st.nextToken());
            int baekY = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(tangent_point(choX, choY, r1, baekX, baekY, r2)).append('\n');
        }
        System.out.println(sb);
    }
    // 접점 개수 구하는 함수
    public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {
        int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // 중점간 거리 distance의 제곱
        // Math.sqrt를 써서 double 형으로 처리하면 정확한 값 아닐 수 있기때문

        // case 1 : 중점이 같으면서도 반지름도 같을 경우
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }

        // case 2-1 : 두 원의 반지름 합보다 중점간 거리가 더 길 때
        else if (distance_pow > Math.pow(r1 + r2, 2)) {
            return 0;
        }

        // case 2-2 : 원 안에 원이 있으나 내접하지 않을 때
        else if (distance_pow < Math.pow(r2 - r1, 2)) {
            return 0;
        }

        // case 3-1 : 내접할 때
        else if (distance_pow == Math.pow(r2 - r1, 2)) {
            return 1;
        }

        // case 3-2 : 외접할 때
        else if (distance_pow == Math.pow(r1 + r2, 2)) {
            return 1;
        }
        else {
            return 2;
        }
    }
}