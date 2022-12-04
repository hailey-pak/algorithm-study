import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long[] arr = new long[String.valueOf(n).length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        return Long.parseLong(sb.toString());
    }
}