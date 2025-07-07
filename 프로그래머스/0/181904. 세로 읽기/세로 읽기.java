import java.util.*;

class Solution {
    public String solution(String str, int m, int c) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i += m) {
            String sub = str.substring(i, i + m);
            result.add(sub);
        }
        
        String answer = "";
        for (String str2 : result) {
            answer += str2.substring(c-1, c);
        }
        
        return answer;
    }
}