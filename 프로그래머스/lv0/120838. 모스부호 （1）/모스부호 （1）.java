class Solution {
     private final String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] str = letter.split(" ");
        for (String s : str) {
            int idx = java.util.Arrays.asList(morse).indexOf(s);
            sb.append(Character.toString(idx + 97));
        }
        return sb.toString();
    }
}