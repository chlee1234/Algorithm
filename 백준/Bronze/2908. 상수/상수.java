import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        a = a/100 + (a%10) * 100 + ((a%100)-(a%10));
        b = b/100 + (b%10) * 100 + ((b%100)-(b%10));

        int max = Math.max(a,b);
        System.out.println(max);
    }
}