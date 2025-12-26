import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] brr = Arrays.copyOf(arr, arr.length);
        ArrayList<int[]> crr = new ArrayList<>();
        int h = 0;
        
        crr.add(Arrays.copyOf(arr, arr.length));

        
        while(true) {
            
            for(int i = 0; i < arr.length; i++){
                if(brr[i] >= 50 && brr[i] % 2 == 0){
                    brr[i] = brr[i] / 2;
                } else if(brr[i] < 50 && brr[i] % 2 == 1 ){
                    brr[i] = (brr[i] * 2) + 1; 
                }
            }
            crr.add(Arrays.copyOf(brr, brr.length));
            
            if(h > 0 && Arrays.equals(crr.get(h-1), crr.get(h))){
                answer = h-1;
                break;
            } else {
                h++;
            }
        }
        
        return answer;
    }
}