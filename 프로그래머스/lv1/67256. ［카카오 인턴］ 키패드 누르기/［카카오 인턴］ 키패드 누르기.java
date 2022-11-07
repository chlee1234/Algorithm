class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        int leftHand = 10; // *
        int rightHand = 12; // #

        for (int number : numbers) {

            if (number == 0) number = 11;  //0

            switch (number % 3) {
                case 0:    // right
                    rightHand = number;
                    sb.append("R");
                    break;
                case 1:    // left
                    leftHand = number;
                    sb.append("L");
                    break;
                case 2:    // middle

                    int disL = leftHand - number;     // 왼손번호 - 눌러야할 번호
                    if (disL < 0) disL = disL * -1;   // 양수 전환

                    int disR = rightHand - number;    // 오른손번호 - 눌러야할 번허
                    if (disR < 0) disR = disR * -1;   // 양수 전환

                    int distanceL = (disL % 3) + (disL / 3);  // 번호와의 거리(왼손)
                    int distanceR = (disR % 3) + (disR / 3);  // 번호와의 거리(오른손)

                    if (distanceL < distanceR) {   // 왼손의 거리가 더 짧을 경우
                        leftHand = number;
                        sb.append("L");
                    } else if (distanceL > distanceR) {   // 오른손의 거리가 더 짧을 경우
                        rightHand = number;
                        sb.append("R");
                    } else {   // 거리가 같을 경우 
                        if ("left".equals(hand)) {
                            leftHand = number;
                            sb.append("L");
                        } else {
                            rightHand = number;
                            sb.append("R");
                        }
                    }
                    break;
            }
        }
        return sb.toString();
    }
}