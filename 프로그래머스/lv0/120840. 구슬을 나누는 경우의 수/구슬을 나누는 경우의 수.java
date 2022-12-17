class Solution {
    public int solution(int balls, int share) {
        return combi(balls, share);
    }
    
    public int combi(int n, int r) {
        if (r == 0 || r == n) return 1;
        return combi(n-1, r-1) + combi(n-1, r);
    }
}