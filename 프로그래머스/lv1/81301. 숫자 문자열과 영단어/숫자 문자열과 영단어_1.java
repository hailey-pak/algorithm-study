import java.util.HashMap;

class Solution {
    public int solution(String s) {
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

        StringBuilder key = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                key.append(s.charAt(i));
                if (map.containsKey(key.toString())) {
                    ans.append(map.get(key.toString()));
                    key.setLength(0);
                }
            } else {
                ans.append(s.charAt(i));
            }
        }
        return Integer.parseInt(ans.toString());
    }
}