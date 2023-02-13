class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        char[] charS = s.toCharArray();
        char[] charSkip = skip.toCharArray();
        for (int i = 0; i < charS.length; i++) {
            char temp = charS[i];
            for (int k = 0; k < index; k++) {
                temp++;
                if (skip.contains(String.valueOf(temp))) {
                    while (skip.contains(String.valueOf(temp))) {
                        temp++;
                        if (temp == (char) 123) temp -= 26;
                    }
                } else {
                    if (temp == (char) 123) temp -= 26;
                    while (skip.contains(String.valueOf(temp))) {
                        temp++;
                        if (temp == (char) 123) temp -= 26;
                    }
                }
            }
            sb.append(temp);
        }
        return sb.toString();
    }
}