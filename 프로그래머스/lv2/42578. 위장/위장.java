import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] str : clothes) {
            map.put(str[1], map.getOrDefault(str[1], 0) + 1);
        }

        int ans = 1;
        for (String key : map.keySet()) {
            ans *= map.get(key) + 1;
        }

        return ans - 1;
    }
}