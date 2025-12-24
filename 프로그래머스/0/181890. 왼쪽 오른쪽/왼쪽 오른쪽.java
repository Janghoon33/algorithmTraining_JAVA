import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};

        int a = Arrays.asList(str_list).indexOf("l");
        int b = Arrays.asList(str_list).indexOf("r");
        
        if(a != -1 && b != -1){
            answer = a < b ? Arrays.copyOfRange(str_list, 0, a) : Arrays.copyOfRange(str_list, b+1, str_list.length);            
        } else if( a == -1 && b == -1){
            
        } else if( a == -1 || b == -1){
            answer = a == -1 ? Arrays.copyOfRange(str_list, b+1, str_list.length) : Arrays.copyOfRange(str_list, 0, a);
        }
        
        return answer;
    }
}