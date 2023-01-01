import java.util.Arrays;

class Solution {
    public int solution(int []A, int []B) {
        int sum = 0;
        int len = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < len; i++) {
            sum += A[i] * B[len-1-i];
        }
        return sum;
    }
}