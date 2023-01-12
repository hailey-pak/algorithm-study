class Solution {
    public long solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        long[] ans = new long[n+1];
        ans[1] = 1;
        ans[2] = 2;

        for(int i = 3; i < n + 1; i++){
            ans[i] = (ans[i-2] + ans[i-1]) % 1234567;
        }
        return ans[n];
    }
}