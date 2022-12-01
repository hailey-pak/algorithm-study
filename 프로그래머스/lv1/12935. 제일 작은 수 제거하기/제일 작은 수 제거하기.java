class Solution {
    public int[] solution(int[] arr) {
        if (arr.length==1) return new int[]{-1};

        int minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIdx]) minIdx = i;
        }

        int[] answer = new int[arr.length-1];
        for (int i = 0; i < minIdx; i++) {
            answer[i] = arr[i];
        }
        for (int i = minIdx; i < arr.length-1; i++) {
            answer[i] = arr[i+1];
        }

        return answer;
    }
}