import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(char i = 'A'; i <= 'Z'; i++) {
            int count = 0;
            for(int j = 0; j < my_string.length(); j++){
                if(my_string.charAt(j) == i){
                    count++;
                }
            }
            answer.add(count);
        }
        
        for(char i = 'a'; i <= 'z'; i++) {
            int count = 0;
            for(int j = 0; j < my_string.length(); j++){
                if(my_string.charAt(j) == i){
                    count++;
                }
            }
            answer.add(count);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}