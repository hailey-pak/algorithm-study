import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            int i = (int) (n % 10);
            list.add(i);
            n = n / 10;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}