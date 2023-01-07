import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : scoville) {
            pq.offer(i);
        }

        while (pq.peek() < K) {
            if (pq.size() == 1) return -1;

            int a = pq.poll();
            int b = pq.poll();

            int mix = a + (b * 2);
            pq.offer(mix);
            answer++;
        }
        return answer;
    }
}