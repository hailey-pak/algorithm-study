class Solution {
    public int solution(int n, int a, int b) {
        int r = 0;

        while (n != 1) {
            r++;

             if (Math.abs(a - b) == 1) {
                if (a / 2 != b / 2) {
                   break;
                }
            }

            n >>= 1;
            a = a % 2 == 0 ? a / 2 : a / 2 + 1;
            b = b % 2 == 0 ? b / 2 : b / 2 + 1;
        }
        return r;
    }
}