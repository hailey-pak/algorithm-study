class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        int idx = str.indexOf(k+"");
        return idx == -1 ? idx : idx + 1;
    }
}