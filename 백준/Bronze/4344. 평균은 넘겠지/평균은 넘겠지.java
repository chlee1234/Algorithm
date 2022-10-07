import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int[] arr;

        for (int i = 0; i < C; i++){
            int N = sc.nextInt(); // 학생 수
            arr = new int[N];
            double sum = 0; // 성적 누적 합 변수
            //성적 입력부분
            for (int j = 0; j < N; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double mean = (sum / N);
            double cnt = 0; // 평균 넘는 학생 수 변수
            // 평균 넘는 학생 비율 찾기
            for (int j = 0; j < N; j++){
                if(arr[j] > mean){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", (cnt/N)*100);
        }
        sc.close();
    }
}