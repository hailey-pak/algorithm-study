import java.util.HashMap;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> map = new HashMap<>();
        for (String[] str : db) {
            map.put(str[0], str[1]);
        }

        if (map.containsKey(id_pw[0])) {
            if (map.get(id_pw[0]).equals(id_pw[1])) {
                return "login";
            } else {
                return "wrong pw";
            }
        }
        return "fail";
    }
}