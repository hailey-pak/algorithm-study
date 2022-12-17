class Solution {
    
    int[][] pads = {
            {3,1}, //0
            {0, 0}, {0, 1}, {0, 2}, //1,2,3
            {1, 0}, {1, 1}, {1, 2}, //4,5,6
            {2, 0}, {2, 1}, {2, 2}  //7,8,9
    };

    int[] curL = {3,0};
    int[] curR = {3,2};
    
    public String solution(int[] numbers, String hand) {
        hand = hand.substring(0,1).toUpperCase();
        StringBuilder sb = new StringBuilder();

        for (int num : numbers) {
            String s = push(num);
            if (s == null) {
                s = hand;
            }
            sb.append(s);

            if(s.equals("L")) {
                curL = pads[num];
            } else {
                curR = pads[num];
            }
        }

        return sb.toString();
    }
    
    private String push(int num) {
        if(num==1 || num==4 || num==7) return "L";
        if(num==3 || num==6 || num==9) return "R";

        // 2,5,8,0
        int gapL = Math.abs(curL[0]- pads[num][0]) + Math.abs(curL[1] - pads[num][1]);
        int gapR = Math.abs(curR[0]- pads[num][0]) + Math.abs(curR[1] - pads[num][1]);

        if (gapL < gapR) return "L";
        if (gapL > gapR) return "R";

        //같으면
        return null;
    }
}