import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static boolean[] prime = new boolean[246913];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        get_prime(); // 소수를 얻는 메소드 실행


        while (true){
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int cnt = 0;

            for (int i = n+1; i<=2*n; i++){
                if(!prime[i]) cnt++;
            }
            System.out.println(cnt);
        }
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