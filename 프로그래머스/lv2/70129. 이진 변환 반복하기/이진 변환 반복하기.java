class Solution {
    public int[] solution(String s) {
        int sum = 0;
        int cnt = 0;

        while (!s.equals("1")) {
            for (char c : s.toCharArray()) {
                if (c == '0') sum++;
            }
            s = s.replaceAll("0", "");
            int n = s.length();
            s = Integer.toBinaryString(n);
            cnt++;
        }

        return new int[]{cnt, sum};
    }
}