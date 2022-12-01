import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length==1) return new int[]{-1};

        List<Integer> list = new ArrayList<>();
        int minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if (arr[i] < arr[minIdx]) minIdx = i;
        }

        list.remove(minIdx);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}