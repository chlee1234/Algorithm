import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] stage = new double[N + 1];

        for (int i : stages) {
            if (i == N + 1){
                continue;
            }
            stage[i]++;
        }

        ArrayList<Double> fail = new ArrayList<>();

        double num = stages.length;
        double temp = 0;

        for (int i = 1; i < stage.length; i++) {
            temp = stage[i];
            if (num == 0){
                stage[i] = 0;
            }else {
                stage[i] = stage[i] / num;
                num = num - temp;
            }
            fail.add(stage[i]);
        }
        fail.sort(Collections.reverseOrder());
        for (int i = 0; i < fail.size(); i++) {
            for (int j = 1; j < stage.length; j++){
                if (fail.get(i) == stage[j]){
                    answer[i] = j;
                    stage[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}