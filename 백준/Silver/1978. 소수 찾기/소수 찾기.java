import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++){
            boolean isPrime = true;

            if (arr[i] == 1){
                continue;
            }
            for (int j = 2; j <= Math.sqrt(arr[i]);j++){
                if(arr[i] % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}