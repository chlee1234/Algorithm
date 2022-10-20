import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int num = nums.length/2;
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        if (num < set.size()){
            answer = num;
        } else if (num >= set.size()){
            answer = set.size();
        }
        return answer;
    }
}