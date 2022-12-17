class Solution {
    public int solution(int[] array, int n) {
        int min = array[0];
        for (int a : array) {
            int val = Math.abs(a - n);
            if (Math.abs(min - n) > val) {
                min = a;
            }
            if (Math.abs(min - n) == val) {
                min = Math.min(min, a);
            }
        }
        return min;
    }
}