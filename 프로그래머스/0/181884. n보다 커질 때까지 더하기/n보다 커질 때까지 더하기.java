class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int sum = 0;
        
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
            if(sum > n){
                answer = sum;
                break;
            }
        }
        
        return answer;
    }
}