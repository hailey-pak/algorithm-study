class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] all = new int[n+2];
        for (int i : lost) all[i]--;
        for (int i : reserve) all[i]++;

        int cnt = n;
        for (int i = 1; i <= n; i++) {
            if (all[i] == -1) {
                if (all[i-1] > 0) {
                    all[i]++;
                    all[i-1]--;
                } else if (all[i+1] > 0) {
                    all[i]++;
                    all[i+1]--;
                } else {
                    cnt--;
                }
            }
        }
        return cnt;
    }
}