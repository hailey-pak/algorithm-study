class Solution {
    public int solution(String t, String p) {
        int cnt = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            int n = p.compareTo(t.substring(i, i + p.length()));
            if (n >= 0) cnt++;
        }
        return cnt;
    }
}