import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (st.hasMoreTokens()) {
            int i = Integer.parseInt(st.nextToken());
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return min + " " + max;
    }
}