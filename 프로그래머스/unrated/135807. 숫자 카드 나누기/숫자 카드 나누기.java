class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int A = arrayA[0];
        int B = arrayB[0];
        for (int i = 1; i < arrayA.length; i++) {
            A = gcd(A, arrayA[i]);
            B = gcd(B, arrayB[i]);
        }
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % B == 0) {
                B = 1;
                break;
            }
        }
        for (int i = 0; i < arrayB.length; i++) {
            if (arrayB[i] % A == 0) {
                A = 1;
                break;
            }
        }
        if (A != 1 || B != 1) {
            answer = Math.max(A, B);
        }
        return answer;
    }

    public int gcd(int a, int b) {
        int r = a % b;
        if (r == 0) return b;
        else return gcd(b, r);
    }
}