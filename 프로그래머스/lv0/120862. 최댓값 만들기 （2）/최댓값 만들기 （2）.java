import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        numbers = Arrays.stream(numbers).sorted().toArray();
        int max = numbers[numbers.length-1] * numbers[numbers.length-2];

        for (int i = numbers.length - 2; i > 0 ; i--) {
            if (numbers[i] < 0) {
                max = Math.max(max, numbers[i] * numbers[i-1]);
                break;
            }
        }
        return max;
    }
}