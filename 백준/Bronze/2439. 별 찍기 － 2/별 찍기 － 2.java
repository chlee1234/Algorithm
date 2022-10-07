import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= T; i++){
            for(int j = 1; j <= T-i; j++){
                sb.append(" ");
            }
            for(int j = 1; j <= i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}