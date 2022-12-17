class Solution {  
    public int solution(String[] spell, String[] dic) {
        for(String d : dic) {
            boolean isExist = true;
            for(String s : spell) {
                if(d.indexOf(s) == -1) {
                    isExist = false;
                    break;
                }
            }
            if (isExist) return 1;
        }
        return 2;
    }
}