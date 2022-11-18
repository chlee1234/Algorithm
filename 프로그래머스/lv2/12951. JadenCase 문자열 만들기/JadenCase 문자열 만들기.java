class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.toLowerCase().split("");  // 모든 문자열 소문자로 변경
        boolean isFirst = true;  // 첫 글자는 대문자

        for (String s1 : str) {
            answer += isFirst ? s1.toUpperCase() : s1;  // 첫 글자일 경우 대문자로 변경
            isFirst = s1.equals(" ");  // 공백이 나오면 첫 글자 플래그 true로 변경
        }
        return answer;
    }
}