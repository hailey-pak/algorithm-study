import java.util.Iterator;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> sum = new TreeSet<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sum.size()];
        Iterator iter = sum.iterator();
        int i = 0;
        while (iter.hasNext()) {
            answer[i++] = (int) iter.next();
        }
        return answer;
    }
}