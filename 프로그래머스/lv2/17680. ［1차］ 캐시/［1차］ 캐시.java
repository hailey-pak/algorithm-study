import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        Queue<String> queue = new LinkedList<>();   //Queue -> FIFO(선입선출)

        int sum = 0;
        for (String s : cities) {
            s = s.toLowerCase();
            
            if (queue.contains(s)) {
                sum += 1;
                queue.remove(s);        //해당 객체 제거 (제일 마지막에 다시 넣기 위해)

            } else {
                sum += 5;
                if (cacheSize != 0 && queue.size() == cacheSize) {
                    queue.remove();     //가장 먼저 들어온 객체 제거
                }
            }
            if (cacheSize != 0) queue.add(s);
        }

        return sum;
    }
}