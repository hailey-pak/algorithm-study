import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) idx = i;
        }
        return new int[]{max, idx};
    }
}