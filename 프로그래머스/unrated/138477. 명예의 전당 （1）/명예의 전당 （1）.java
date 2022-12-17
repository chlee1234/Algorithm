import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            list.sort(Collections.reverseOrder());
            if (i <= k - 1) {
                answer[i] = list.get(i);
            } else {
                answer[i] = list.get(k - 1);
            }
        }
        return answer;
    }
}