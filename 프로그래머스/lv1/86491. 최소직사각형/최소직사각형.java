class Solution {
    public int solution(int[][] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];

            if (w < h) {
                sizes[i][0] = h;
                sizes[i][1] = w;
            }
        }

        int maxW = 0, maxH = 0;
        for (int[] size : sizes) {
            if (size[0] > maxW) maxW = size[0];
            if (size[1] > maxH) maxH = size[1];
        }
        return maxW * maxH;
    }
}