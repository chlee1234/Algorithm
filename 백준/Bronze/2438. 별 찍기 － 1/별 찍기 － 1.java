import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}