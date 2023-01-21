import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    final static int MAX = 1000 + 1;
    static boolean[][] graph;
    static boolean[] visited;
    static ArrayList<Integer> queue;
    static int N, M, V;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        // 1. graph 정보 입력
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;
        }
        // 2. dfs
        dfs(V);
        System.out.println();
        // 3. bfs
        bfs();
    }

    static void dfs(int idx) {
        System.out.print(idx + " ");
        visited[idx] = true;
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[idx][i])
                dfs(i);
        }
    }

    static void bfs() {
        queue = new ArrayList<>();
        visited = new boolean[MAX];

        queue.add(V);
        visited[V] = true;

        while (!queue.isEmpty()) {
            int idx = queue.remove(0);
            System.out.print(idx + " ");
            for (int i = 1; i <= N; i++) {
                if (!visited[i] && graph[idx][i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}