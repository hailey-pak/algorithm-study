class Solution {
    public int solution(int a, int b, int n) {
       int cnt = 0;
        while (n >= a) {
            int i = (n / a) * b;
            cnt += i;
            n = (n % a) + i;
        }
        return cnt;
    }
}