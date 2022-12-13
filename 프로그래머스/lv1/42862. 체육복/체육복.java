class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] all = new int[n+1];
        for (int i = 1; i <= n; i++) {
            all[i] = 1;
        }
        for (int i : lost) all[i]--;
        for (int i : reserve) all[i]++;

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (all[i] == 0) {
                if (i != 1 && all[i-1] > 1) {
                    all[i]++;
                    all[i-1]--;
                    cnt++;
                    continue;
                }
                if (i != n && all[i+1] > 1) {
                    all[i]++;
                    all[i+1]--;
                    cnt++;
                }
            } else {
                cnt++;
            }
        }
        return cnt;
    }
}