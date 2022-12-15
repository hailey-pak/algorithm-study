class Solution {
    public int solution(int[] numbers) {
        int all = 1+2+3+4+5+6+7+8+9;
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return all - sum;
    }
}