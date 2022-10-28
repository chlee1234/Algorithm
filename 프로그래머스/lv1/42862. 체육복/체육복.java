import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        // 여분 체육복이 있지만 도난당한 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = reserve[j] = -1;  // 다른 학생에게 빌려줄 수 없는 상태로 만듦.
                    break;
                }
            }
        }
        // 도난당한 학생에게 체육복을 빌려주는 경우
        for (int i = 0; i <lost.length; i++){
            for (int j = 0; j < reserve.length; j++){
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}