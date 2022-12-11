class Solution {
    public int solution(int n) {
        int gcd = gcd(n, 6);
        return n / gcd;
    }

    public int gcd(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}