class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int fraction = denum1 * num2 + denum2 * num1;
        int numerator = num1 * num2;
        int mod = gcd(fraction, numerator);
        return new int[]{fraction/mod, numerator/mod};
    }
    
    public int gcd(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (b == 0) return a;
        return gcd(b , a % b);
    }
}