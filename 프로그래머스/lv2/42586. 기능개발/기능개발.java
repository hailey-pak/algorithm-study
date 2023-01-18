import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int n = 0;
            int p = progresses[i];
            while (p < 100) {
                p += speeds[i];
                n++;
            }
            queue.add(n);
        }

        ArrayList<Integer> list = new ArrayList<>();
        int n = 0, k = 0;
        while (queue.size() != 0) {
            if (n == 0) {
                k = queue.poll();
            } else {
                if (queue.peek() <= k) {
                    queue.poll();
                } else {
                    list.add(n);
                    n = 0;
                    k = queue.poll();
                }
            }
            n++;
        }
        list.add(n);

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}