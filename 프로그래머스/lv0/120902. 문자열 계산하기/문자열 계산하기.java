class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int ans = Integer.parseInt(str[0]);
        for (int i = 1; i < str.length; i++) {
            if (str[i].equals("+")) {
                ans += Integer.parseInt(str[i+1]);
            }
            if (str[i].equals("-")) {
                ans -= Integer.parseInt(str[i+1]);
            }
        }
        return ans;
    }
}