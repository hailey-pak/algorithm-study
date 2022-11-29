import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int a : arr) {
            if (a % divisor == 0) {
                list.add(a);
            }
        }
        int[] answer;
        if ( list.size()==0) {
            answer = new int[]{-1};
        } else {
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}