class Solution {
    public int solution(int[] array) {
        int[] all = new int[1001];
        for (int a : array) all[a]++;

        int max = all[0];
        int mode = 0;
        for (int i = 1; i < 1001; i++) {
            if (all[i] > max) {
                max = all[i];
                mode = i;
            } else if (all[i] == max) {
                mode = -1;
            }
        }
        return mode;
    }
}