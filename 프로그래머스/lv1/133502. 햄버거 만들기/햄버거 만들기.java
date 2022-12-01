class Solution {
    public int solution(int[] ingredient) {
        int n = 0;
        StringBuilder sb = new StringBuilder();

        for (int i : ingredient) {
            sb.append(i);
            if (sb.length() > 3 && sb.substring(sb.length()-4, sb.length()).equals("1231")) {
                sb.delete(sb.length()-4, sb.length());
                n++;
            }
        }

        return n;
    }
}