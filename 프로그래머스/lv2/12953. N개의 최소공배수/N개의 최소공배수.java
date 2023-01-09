class Solution {
    public int solution(int[] arr) {
        int lcm = 1;
        for (int a : arr) {
            lcm = a * lcm / gdc(a, lcm);
        }
        return lcm;
    }

    public int gdc(int a, int b) {
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