class Solution {
    public int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) {
            return 1;
        }
        if (dot[0] > 0 && dot[1] < 0) {
            return 4;
        }
        if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        }
        else return 3;
    }
}