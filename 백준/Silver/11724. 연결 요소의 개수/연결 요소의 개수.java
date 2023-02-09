import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i < N + 1; i++) {  // 인접 리스트 초기화하기
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            A[start].add(end);  // 양방향 에지이므로 양쪽에 에지를 더하기
            A[end].add(start);
        }
        int cnt = 0;
        for (int i = 1; i < N + 1; i++) {
            if (!visited[i]) {   // 방문하지 않은 노드가 없을 때까지 반복하기
                cnt++;
                dfs(i);
            }
        }
        System.out.println(cnt);
    }

    static void dfs(int i) {
        if (visited[i]) {
            return;
        }

        visited[i] = true;
        for (int k : A[i]) {
            if (!visited[k]) {   // 연결 노드 중 방문하지 않았던 노드만 탐색하기
                dfs(k);
            }
        }
    }
}