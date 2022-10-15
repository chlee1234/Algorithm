import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int a = 0; a<commands.length; a++){
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            int n = j-i+1;
            int num = i-1;
            int[] temp = new int[n];
            for(int b = 0; b < n; b++){
                temp[b] = array[num];
                num++;
            }
            Arrays.sort(temp);
            answer[a] = temp[k-1];
        }
        return answer;
    }
}