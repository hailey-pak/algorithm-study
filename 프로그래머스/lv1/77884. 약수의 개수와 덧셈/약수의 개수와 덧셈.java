class Solution {
    public int solution(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            //제곱수이면 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                ans -= i;
            } else {
                ans += i;
            }
        }
        return ans;
    }
}