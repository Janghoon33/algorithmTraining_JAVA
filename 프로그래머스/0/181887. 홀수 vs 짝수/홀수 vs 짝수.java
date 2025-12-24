class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(i%2 == 0){
                a = a+num_list[i];
            } else {
                b = b+num_list[i];
            }
        }
        
        return answer = a > b ? a : b;
    }
}