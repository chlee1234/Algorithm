import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[5];
        for (int i = 0; i < 5; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        int avg = (num[0]+num[1]+num[2]+num[3]+num[4])/num.length;
        System.out.println(avg);
        Arrays.sort(num);
        System.out.println(num[2]);
    }
}