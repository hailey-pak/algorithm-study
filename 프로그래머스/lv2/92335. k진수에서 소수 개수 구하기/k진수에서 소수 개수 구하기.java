class Solution {
    public int solution(int n, int k) {
        String s = Integer.toString(n, k);
        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        for (Character c : s.toCharArray()) {
            if (c != '0')  {
                sb.append(c);

            } else {
                if (sb.length() == 0) continue;

                 long i = Long.parseLong(sb.toString());
                sb.delete(0, sb.length());

                if (isPrime(i)) cnt++;
            }
        }
        if (sb.length() != 0) {
             long i = Long.parseLong(sb.toString());
            if (isPrime(i)) cnt++;
        }
        return cnt;
    }
    
    public boolean isPrime(long n) {
        if (n == 1) return false;

        boolean chk = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return chk;
    }
}