class Solution {
    public int solution(int a, int b) {
        int val = b / gcd(a, b);

        while (val != 1) {
            if (val % 2 == 0) {
                val /= 2;
            } else if (val % 5 == 0) {
                val /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }
    
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}