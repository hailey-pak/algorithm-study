import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        if (priorities.length == 1) return 1;

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int p : priorities) {
            q.add(p);
        }

        int n = 0;
        while (!q.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == q.peek()) {
                    n++;
                    if (i == location) {
                        return n;
                    }
                    q.poll();
                }
            }
        }
        return n;
    }
}