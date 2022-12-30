class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for (String str : arr) {
            int i = Integer.parseInt(str);
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return min + " " + max;
    }
}