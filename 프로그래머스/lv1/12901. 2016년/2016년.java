class Solution {
    public String solution(int a, int b) {
        String[] week = new String[]{"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int day = b;
        if (a > 1) {
            for (int i = 1; i < a; i++) {
                if (i==4 || i==6 || i==9 || i==11) {
                    day += 30;
                } else if (i==2) {
                    day += 29;
                } else {
                    day += 31;
                }
            }
        }
        return week[day%7];
    }
}