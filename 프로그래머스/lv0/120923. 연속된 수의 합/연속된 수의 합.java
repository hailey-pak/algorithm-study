import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = total / num;

        if (total % num == 0) {
            for (int i = a - num/2; i <= a + num/2; i++) {
                list.add(i);
            }
        } else {
            for (int i = (a - num/2) + 1; i <= a + num/2; i++) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}