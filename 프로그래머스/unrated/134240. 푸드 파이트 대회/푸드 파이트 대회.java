class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int n = food[i] / 2;
            sb.append(String.valueOf(i).repeat(n));
        }
        String ans = sb.toString();
        return ans + "0" + sb.reverse();
    }
}