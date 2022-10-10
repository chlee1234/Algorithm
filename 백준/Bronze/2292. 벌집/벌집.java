import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 1; // 최소 루트
        int range = 2; // 범위 (최솟값 기준)

        if(N == 1){
            System.out.println("1");
        }
        else {
            while (range <= N) {  // 범위가 N보다 커지기 직전까지 반복
                range = range + (6 * cnt);   // 다음 범위의 최솟값으로 초기화
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}