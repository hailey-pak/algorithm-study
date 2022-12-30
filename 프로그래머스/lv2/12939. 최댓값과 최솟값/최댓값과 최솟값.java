import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        while (st.hasMoreTokens()) {
            long l = Long.parseLong(st.nextToken());
            min = Math.min(min, l);
            max = Math.max(max, l);
        }
        return min + " " + max;
    }
}