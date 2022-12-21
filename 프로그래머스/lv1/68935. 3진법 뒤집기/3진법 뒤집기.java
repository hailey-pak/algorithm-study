class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            sb.append(n % 3);
            n = n / 3;
        }

        int ans = 0;
        int size = sb.toString().length();
        for (int i = 0; i < size; i++) {
            int k = sb.charAt(size-i-1) - '0';
            ans += k * Math.pow(3, i);

        }
        return ans;
    }
}