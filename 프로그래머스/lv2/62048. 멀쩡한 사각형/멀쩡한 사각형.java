class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        long all = (long) w * h;
        int gcd = gcd(w, h);
        answer = all - (long) (((w / gcd) + (h / gcd)) - 1) * gcd;
        return answer;
    }
    public int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}