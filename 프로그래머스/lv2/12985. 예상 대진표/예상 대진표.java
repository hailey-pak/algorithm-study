class Solution {
    public int solution(int n, int a, int b) {
        int r = 0;

        while (n != 1) {
            r++;
            n >>= 1;
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;

            if (a==b) break;
        }
        return r;
    }
}