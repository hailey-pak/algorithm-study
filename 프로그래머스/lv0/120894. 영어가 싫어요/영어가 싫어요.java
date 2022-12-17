import java.util.HashMap;

class Solution {
    public long solution(String numbers) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        StringBuilder sb = new StringBuilder();
        int b = 0, e = 2;
        while (e <= numbers.length()) {
            String s = numbers.substring(b, e);
            if (map.containsKey(s)) {
                sb.append(map.get(s));
                b = e;
                e = b + 2;
            } else {
                e++;
            }
        }
        return Long.parseLong(sb.toString());
    }
}