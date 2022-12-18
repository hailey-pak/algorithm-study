class Solution {
   public int solution(String my_string) {
        int sum = 0;
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for (String s: str) {
            if (!s.equals("")) sum += Integer.parseInt(s);
        }
        return sum;
    } 
}