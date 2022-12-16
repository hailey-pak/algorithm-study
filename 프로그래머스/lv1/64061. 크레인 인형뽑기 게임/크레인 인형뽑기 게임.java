import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();

        int cnt = 0;
        for (int m : moves) {
            for (int i = 0; i < board.length; i++) {
                int n = board[i][m-1];
                if (n != 0) {
                    if (!stack.empty() && stack.peek()==n) {
                        stack.pop();
                        cnt += 2;
                    } else {
                        stack.push(n);
                    }
                    board[i][m-1] = 0;
                    break;
                }
            }
        }
        return cnt;
    }
}