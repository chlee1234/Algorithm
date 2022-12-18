import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int complete;
        int days = 1;
        ArrayList<Integer> array = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> spd = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++)
            que.add(progresses[i]);
        for (int i = 0; i < speeds.length; i++)
            spd.add(speeds[i]);

        while (!que.isEmpty()) {
            complete = 0;
            if (que.peek() + spd.peek() * days  >= 100) {
                while(!que.isEmpty() && que.peek() + spd.peek() * days >= 100) {
                    complete++;
                    que.poll();
                    spd.poll();
                }
                array.add(complete);
            }
            days++;
        }
        int[] answer = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        return answer;
    }
}