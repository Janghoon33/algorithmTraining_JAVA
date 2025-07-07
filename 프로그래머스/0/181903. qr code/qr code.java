import java.util.*;

class Solution {
    public StringBuilder solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < code.length(); i++){
            sb.append(i%q == r ? code.charAt(i) : "");
        }
        return sb;
    }
}