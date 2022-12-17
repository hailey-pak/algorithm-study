import java.util.*;

class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String a : arr) {
            if (a.equals("Z")) {
                if (list.size() > 0) list.remove(list.size()-1);
            } else {
                list.add(Integer.parseInt(a));
            }
        }
        int sum = 0;
        for (int n : list) {
            sum += n;
        }
        return sum;
    }
}