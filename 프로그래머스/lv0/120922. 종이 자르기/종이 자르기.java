class Solution {
    public int solution(int M, int N) {
        int cnt = 0;

        if (M > 1) {
            cnt = M - 1;
            if (N > 1) cnt += (N - 1) * M;
        } else {
            if (N > 1) cnt = N - 1;
        }

        return cnt;
    }
}