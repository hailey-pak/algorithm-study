class Solution {
    public int solution(int[][] dots) {
        int minX = dots[0][0], minY = dots[0][1], maxX = dots[0][0], maxY = dots[0][1];
        for (int[] dot : dots) {
            minX = Math.min(minX, dot[0]);
            maxX = Math.max(maxX, dot[0]);
            minY = Math.min(minY, dot[1]);
            maxY = Math.max(maxY, dot[1]);
        }
        int w = maxX - minX;
        int h = maxY - minY;
        return w * h;
    }
}