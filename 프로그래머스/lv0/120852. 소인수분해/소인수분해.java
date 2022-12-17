import java.util.*;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        int i = 2;
        while (n != 1) {
            if (n % i == 0) {
                n /= i;
                set.add(i);
            } else {
                i++;
            }
        }
        if (set.size() == 0) return new int[]{n};

        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}