import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int temp = 0;
        int cnt = 1;
        int cntMax= 0;

        for (int i = 0; i < 9; i++){
             temp = Integer.parseInt(br.readLine());
             if(temp > max){
                 max = temp;
                 cntMax = cnt;
             }
             cnt++;
        }
        br.close();
        System.out.println(max);
        System.out.println(cntMax);
    }
}