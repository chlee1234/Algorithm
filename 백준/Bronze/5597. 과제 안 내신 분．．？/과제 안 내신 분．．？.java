import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Boolean[] student = new Boolean[30];
        Arrays.fill(student, false);

        for (int i = 0; i < 28; i++){
            student[Integer.parseInt(br.readLine())-1] = true;
        }
        for (int i = 0; i < 30; i++){
            if (!student[i]){
                System.out.println(i+1);
            }
        }
    }
}