class Solution {
    public String solution(String X, String Y) {
        int[] numX = new int[10];
        int[] numY = new int[10];

        for (String s : X.split("")) {
            numX[Integer.parseInt(s)]++;
        }
        for (String s : Y.split("")) {
            numY[Integer.parseInt(s)]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            if (numX[i] > 0 && numY[i] > 0) {
                int min = Math.min(numX[i], numY[i]);
                sb.append(String.valueOf(i).repeat(min));
            }
        }

        String ans = "-1";
        if (sb.length() != 0) {
            if (sb.charAt(0)=='0') {
                ans = "0";
            } else {
                ans = sb.toString();
            }
        }
        return ans;
    }
}