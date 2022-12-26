import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] nameArr = new String[N + 1];

        for (int i = 1; i < N + 1; i++) {
            String name = br.readLine();
            hashMap.put(name, i);
            nameArr[i] = name;
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (CheckNumber(str)) {
                int idx = Integer.parseInt(str);
                sb.append(nameArr[idx]);
            }
            else {
                sb.append(hashMap.get(str));
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static boolean CheckNumber(String str) {
        char check;

        if (str.equals("")) {
            //문자열이 공백인지 확인
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            check = str.charAt(i);
            if (check < 48 || check > 58) {
                //해당 char값이 숫자가 아닐 경우
                return false;
            }
        }
        return true;
    }
}