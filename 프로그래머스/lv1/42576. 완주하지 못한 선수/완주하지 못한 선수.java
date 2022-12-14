import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String part : participant) map.put(part, map.getOrDefault(part, 0) + 1);
        for (String com : completion) map.put(com, map.get(com) - 1);

        String ans = "";
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) ans = entry.getKey();
        }
        return ans;
    }
}