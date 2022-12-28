import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] award = new int[k];
        int[] answer = new int[score.length];

        for (int i = 0; i < k; i++) {
            award[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                award[i] = score[i];
            } else if (Arrays.stream(award).min().getAsInt() <= score[i]) {
                award[0] = score[i];
            }
            Arrays.sort(award);
            answer[i] = award[0];
        }
        return answer;
    }
}