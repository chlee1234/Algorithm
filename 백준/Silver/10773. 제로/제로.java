import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<Integer>();

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++){
            int number = Integer.parseInt(br.readLine());

            if (number == 0){
                stack.pop();
            }
            else {
                stack.push(number);  // push() 대신에 add()로 대체 해도 됨. (똑같이 상단에 원소를 추가하는 메소드다.)
            }
        }
        int sum = 0;

        for (int i : stack) {
            sum += i;
        }
        System.out.println(sum);
    }
}