class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        int[] eat = new int[food.length-1];
        for (int i = 1; i < food.length; i++){
            eat[i-1] = food[i]/2;
        }
        for (int i = 0; i < eat.length; i++){
            for (int j = 0; j < eat[i]; j++){
                sb.append(i+1);
            }
        }
        sb.append(0);
        for (int i = eat.length-1; i >= 0; i--){
            for (int j = eat[i]; j >0; j--){
                sb.append(i+1);
            }
        }
        return sb.toString();
    }
}