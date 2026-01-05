class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i = 0; i < num_list.length; i++){
            int calNum = num_list[i];
            
            while(true){
                if (calNum == 1){
                    break;
                } else if(calNum != 1 && calNum % 2 == 0){
                    calNum = calNum / 2;
                    answer += 1;
                } else if (calNum != 1 && calNum % 2 == 1) {
                    calNum = (calNum-1) / 2;
                    answer += 1;
                } 
            }
            
            
        }
        return answer;
    }
}