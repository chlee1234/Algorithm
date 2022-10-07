import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int max = 0;

        if(A != B && A != C && B != C){ // 모든 수가 다른 경우
            if(A > B){
                if(A > C){
                    max = A;
                }
                else{
                    max = C;
                }
            }
            else{
                if(C > B){
                    max = C;
                }
                else{
                    max = B;
                }
            }
            System.out.println(max * 100);
        }
        else {
            if(A == B && B == C){
                System.out.println(A * 1000 + 10000);
            }
            else{
                if(A == B || A == C){
                    System.out.println(A * 100 + 1000);
                }
                else {
                    System.out.println(B * 100 + 1000);
                }
            }
        }
    }
}