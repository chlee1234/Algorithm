import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for (int i = 1; i < s.length(); i++) {
            answer[i] = s.lastIndexOf(s.charAt(i), i-1);
            if (answer[i] != -1) {
                answer[i] = i - answer[i];
            }
        }
        return answer;
    }
}