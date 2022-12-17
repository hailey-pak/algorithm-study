class Solution {
    public int[] solution(String[] key, int[] board) {
       int[] answer = new int[] {0, 0};
        int maxW = board[0] / 2;
        int maxH = board[1] / 2;

        for (String s : key) {
            switch (s) {
                case "up":
                    answer[1] = answer[1] + 1 <= maxH ? answer[1] + 1 : answer[1];
                    break;
                case "down":
                    answer[1] = answer[1] - 1 >= maxH * -1 ? answer[1] - 1 : answer[1];
                    break;
                case "left":
                    answer[0] = answer[0] - 1 >= maxW * -1 ? answer[0] - 1 : answer[0];
                    break;
                case "right":
                    answer[0] = answer[0] + 1 <= maxW ? answer[0] + 1 : answer[0];
                    break;
            }
        }
        return answer;
    }
}