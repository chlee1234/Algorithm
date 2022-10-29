class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int win = 0; // 맞춘 번호
        int zero = 0; // 알아볼 수 없는 번호
        
        for(int i : lottos){
            if(i == 0){ // 번호를 알아볼 수 없는 경우
                zero++;
            } else {
                for(int j : win_nums){
                if(i == j){
                    win++;
                    break;
                }
            }
            }
        }
        
        answer[0] = (win+zero) > 1 ? 7-(win+zero) : 6; // 최고 순위 번호 (win+zero는 최대 당첨 개수)
        answer[1] = win > 1 ? 7-win : 6;  // 최저 순위 번호
        return answer;
    }
}