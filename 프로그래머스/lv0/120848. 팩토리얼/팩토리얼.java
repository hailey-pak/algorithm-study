class Solution {
    public int solution(int n) {
        int idx = 1;
        while (true) {
            int val = factorial(idx);
            if (val == n) return idx;
            if (val > n) return idx-1;
            idx++;
        }
    }

    public int factorial (int num) {
        if (num == 1) return 1;
        return num * factorial ( num - 1 );
    }
}