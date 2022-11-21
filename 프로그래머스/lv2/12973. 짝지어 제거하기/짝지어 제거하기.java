import java.util.Stack;

class Solution{
    public int solution(String s){

        char[] jjack = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < jjack.length; i++){
            char c = jjack[i];
            if (stack.isEmpty()) stack.push(c);
            else {
                if (stack.peek() == c){
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}