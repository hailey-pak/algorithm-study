import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int s : scoville) {
            queue.add(s);
        }

        int answer = 0;
        while (queue.size() >= 2) {
            if (queue.peek() >= k) {
                break;
            }

            int mix = queue.poll() + (queue.poll() * 2);
            queue.add(mix);
            answer++;
        }
        return queue.peek() < k ? -1 : answer;
    }
}