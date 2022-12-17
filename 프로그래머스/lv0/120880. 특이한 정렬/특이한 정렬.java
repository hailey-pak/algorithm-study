import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int number : numbers) set.add(number);
        int[] ans = new int[numbers.length];

        for (int i = 0; i < ans.length; i++) {
            Iterator<Integer> iterator = set.iterator();
            int min = iterator.next();
            while (iterator.hasNext()) {
                int val = iterator.next();
                if (Math.abs(n - val) < Math.abs(n - min)) {
                    min = val;
                } else if (Math.abs(n - val) == Math.abs(n - min) && val > min) {
                    min = val;
                }
            }
            ans[i] = min;
            set.remove(min);
        }

        return ans;
    }
}