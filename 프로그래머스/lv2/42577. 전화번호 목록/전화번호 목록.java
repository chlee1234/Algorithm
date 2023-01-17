import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> hs = new HashSet<>();

        for (String phone_number : phone_book) {
            hs.add(phone_number);
        }
        for (String phone_number : phone_book) {
            for (int i = 1; i < phone_number.length(); i++){
                if (hs.contains(phone_number.substring(0,i))){
                    return false;
                }
            }
        }
        return answer;
    }
}