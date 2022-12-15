class Solution {
    public int[] solution(int[] lotto, int[] win_nums) {
        int min = 7;            //번호가 2개 일치하면 5등이라서 7에서 빼주려고 설정
        int zero = 0;
        for (int i : lotto) {
            if (i == 0) {
                zero++;
                continue;
            }
            for (int w : win_nums) {
                if (i == w) {
                    min --;
                    break;
                }
            }
        }

        int max = min - zero;
        
       //맞는 번호가 하나도 없는 경우는 2가지로 나뉨
        //1. zero가 존재해서 zero의 수가 맞춘 개수가 되는 경우 / 2. zero가 0개 이고 로또 숫자가 모두 틀린경우
        if (min == 7) {
            min = 6;
            if (zero == 0) {
                max = 6;
            }
        }

        return new int[]{max, min};
    }
}