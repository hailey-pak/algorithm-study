import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<String, Integer> map = new HashMap<>();
        int[] scores = {0, -3, -2, -1, 0, 1, 2, 3};

        for (int i = 0; i < survey.length; i++) {
            String s = survey[i].substring(1);
            map.put(s, map.getOrDefault(s, 0) +  scores[choices[i]]);
        }
        StringBuilder sb = new StringBuilder();

        if (map.getOrDefault("R", 0) >= map.getOrDefault("T", 0)) sb.append("R");
        else sb.append("T");

        if (map.getOrDefault("C", 0) >= map.getOrDefault("F", 0)) sb.append("C");
        else sb.append("F");

        if (map.getOrDefault("J", 0) >= map.getOrDefault("M", 0)) sb.append("J");
        else sb.append("M");

        if (map.getOrDefault("A", 0) >= map.getOrDefault("N", 0)) sb.append("A");
        else sb.append("N");

        return sb.toString();
    }
}