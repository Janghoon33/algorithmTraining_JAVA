import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int ls = num_list.length; // 배열의 크기
        
        int[] list1 = Arrays.copyOfRange(num_list, n, ls);
        int[] list2 = Arrays.copyOfRange(num_list, 0, n);
        
        int[] answer = IntStream.concat(Arrays.stream(list1), Arrays.stream(list2)).toArray();

        return answer;
    }
}