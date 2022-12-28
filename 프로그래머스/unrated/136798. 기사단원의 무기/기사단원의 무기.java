class Solution {
    public int solution(int number, int limit, int power) {
       int[] arr = new int[number];
        arr[0] = 1;
        for (int i = 2; i <= number; i++) {
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    arr[i-1] = arr[i-1] + 2;
                    if (j == Math.sqrt(i)) {
                        arr[i-1] = arr[i-1] -1;
                    }
                }
            }
        }

        int sum = 0;
        for (int i : arr) {
            if (i > limit) {
                sum += power;
            } else {
                sum += i;
            }
        }
        return sum;
    }
}