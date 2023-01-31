import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int answer = 1;
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                String name = st.nextToken();
                String wear = st.nextToken();
                map.put(wear, map.getOrDefault(wear, 0) + 1);
            }
            for (String key : map.keySet()) {
                answer *= (map.get(key) + 1);
            }
            System.out.println(answer - 1);
            answer = 1;
        }
    }
}