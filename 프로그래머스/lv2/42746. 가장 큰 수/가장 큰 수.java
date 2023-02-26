import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numbers[i] + "";
        }

        Arrays.sort(arr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        if (sb.charAt(0) == '0') return "0";

        return sb.toString();
    }
}