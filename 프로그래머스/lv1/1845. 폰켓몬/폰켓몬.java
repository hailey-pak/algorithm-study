import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length / 2;
        int d = (int) Arrays.stream(nums).distinct().count();
        return Math.min(n, d);
    }
}