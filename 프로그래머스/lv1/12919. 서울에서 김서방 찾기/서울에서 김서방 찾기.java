class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){ //equals() 메소드는 객체끼리 내용 비교, '==' 쓰면 안됨!
                answer = "김서방은 "+ i+"에 있다";
                break;
            }
        }
        return answer;
    }
}