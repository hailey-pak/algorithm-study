import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int[] count = new int[201];

        for (int[] line : lines) {
            int min = Math.min(line[0], line[1]);
            int max = Math.max(line[0], line[1]);

            for (int j = min; j < max; j++) {
                count[j + 100]++;
            }
        }

        int ans = 0;
        for (int n : count) {
            if (n >= 2) ans++;
        }
        return ans;
    }
}