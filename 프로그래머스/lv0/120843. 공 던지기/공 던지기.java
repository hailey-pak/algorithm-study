class Solution {
    public int solution(int[] numbers, int k) {
        int n = 2 * k - 1;
        int idx = numbers.length > n ? n: n % numbers.length;
        idx = idx - 1 < 0 ? numbers.length - 1 : idx - 1;
        return numbers[idx];
    }
}