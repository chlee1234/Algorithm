import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> H = new HashSet<Integer>();

        for (int i = 0; i < 10; i++){
             H.add(Integer.parseInt(br.readLine()) % 42);
        }
        br.close();
        System.out.println(H.size());
    }
}