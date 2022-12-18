import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> sum = new HashSet<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = Arrays.stream(sum.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}