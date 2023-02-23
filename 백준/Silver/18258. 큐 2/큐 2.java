import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");  // 문자열 분리

            switch (st.nextToken()) {

                case "push" :
                    // offer는 큐의 맨 뒤에 요소를 추가한다.
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    Integer item = q.poll();
                    if (item == null) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(item).append('\n');
                    }
                    break;

                case "size" :
                    sb.append(q.size()).append('\n');
                    break;

                case "empty":
                    if (q.isEmpty()) {
                        sb.append(1).append('\n');
                    }
                    else {
                        sb.append(0).append('\n');
                    }
                    break;

                case "front":
                    Integer ite = q.peek();
                    if (ite == null) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(ite).append('\n');
                    }
                    break;

                case "back":
                    Integer it = q.peekLast();
                    if (it == null) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(it).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}