import java.util.*;

class Solution {
    public String solution(String str, int m, int c) {
        String answer = "";

        for (int i = c - 1; i < str.length(); i += m) {
            answer += str.charAt(i);
        }
        return answer;
    }
}