import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] sum = new int[score.length];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = score[i][0] + score[i][1];
        }

        int[] rank = new int[sum.length];
        for (int i = 0; i < rank.length; i++) {
            int n = 1;
            for (int s : sum) {
                if (sum[i] < s) n++;
            }
            rank[i] = n;
        }
        return rank;
    }
}