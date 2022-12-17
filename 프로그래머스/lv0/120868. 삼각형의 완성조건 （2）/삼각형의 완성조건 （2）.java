class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int cnt  = 0;

        for (int i = Math.max(a, b); i < a + b; i++) {
            cnt++;
        }
        
        for (int i = 1 ; i < Math.max(a,b); i++) {
            if (i + Math.min(a, b) > Math.max(a,b)) {
                cnt++;
            }
        }
        return cnt;
    }
}