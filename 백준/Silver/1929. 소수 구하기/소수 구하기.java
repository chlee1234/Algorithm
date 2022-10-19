import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static boolean[] prime = new boolean[1000001];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        get_prime(); // 소수를 얻는 메소드 실행

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = M; i <= N; i++){
            if(!prime[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);

    }
    // 에라토스테네스의 체
    public static void get_prime(){
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length);i++){
            if(prime[i])
                continue;
            for (int j = i*i; j < prime.length; j += i){
                prime[j] = true;
            }
        }
    }
}