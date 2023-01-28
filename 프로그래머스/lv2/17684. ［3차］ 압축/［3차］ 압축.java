import java.util.*;

class Solution {
    public int[] solution(String msg) {
        HashMap<String, Integer> map = new HashMap<>();

        char c = 'A';
        for (int i = 1; i <= 26; i++) {
            map.put(c+"", i);
            c++;
        }

        Queue<String> queue = new LinkedList<>();
        for (char m : msg.toCharArray()) {
            queue.add(m+"");
        }

        ArrayList<Integer> result = new ArrayList<>();

        String word = "";
        while (!queue.isEmpty() || !"".equals(word)) {

            if (map.containsKey(word + queue.peek())) {
                word += queue.poll();
                continue;
            }

            map.put(word + queue.peek(), map.size()+1);
            result.add(map.get(word));
            word = "";
        }


        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}