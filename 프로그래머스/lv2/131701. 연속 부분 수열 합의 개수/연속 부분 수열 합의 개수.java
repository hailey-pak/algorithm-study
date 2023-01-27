import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();

        int[] arr = new int[elements.length*2];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = elements[i];
            arr[i + elements.length] = elements[i];
        }

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int n = 0;
                for (int k = j; k < j+i+1; k++) {
                    n += arr[k];
                }
                set.add(n);
            }
        }
        
        return set.size();
    }
}