import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] xy1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine()," ");
        int[] xy2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine()," ");
        int[] xy3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int x;
        int y;

        // x 좌표 비교
        if (xy1[0] == xy2[0]){
            x = xy3[0];
        } else if (xy1[0] == xy3[0]) {
            x = xy2[0];
        } else {
            x = xy1[0];
        }
        // y 좌표 비교
        if (xy1[1] == xy2[1]){
            y = xy3[1];
        } else if (xy1[1] == xy3[1]) {
            y = xy2[1];
        } else {
            y = xy1[1];
        }
        System.out.println(x + " " + y);
    }
}