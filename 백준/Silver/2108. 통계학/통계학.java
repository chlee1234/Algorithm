import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        int avg = (int) Math.round((double) sum / N);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max_cnt = Integer.MIN_VALUE;
        for (Integer value : map.values()) {
            if (value > max_cnt){
                max_cnt = value;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max_cnt)) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        int i = 0;
        if (list.size() == 1){
            i = list.get(0);
        }else {
            i = list.get(1);
        }
        System.out.println(avg);
        System.out.println(arr[N/2]);
        System.out.println(i);
        System.out.println(arr[N-1] - arr[0]);

    }
}