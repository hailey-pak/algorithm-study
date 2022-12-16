import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        
        int[][] arr = new int[board.length][board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                arr[i][j] = board[j][i];
            }
        }
        
        int cnt = 0;
        for (int m : moves) {
            for (int i = 0; i < arr[m-1].length; i++) {
                int n = arr[m-1][i];
                if (n != 0) {
                    if (!stack.empty() && stack.peek()==n) {
                        stack.pop();
                        cnt += 2;
                    } else {
                        stack.push(n);
                    }
                    arr[m-1][i] = 0;
                    break;
                }
            }
        }
        return cnt;
    }
}