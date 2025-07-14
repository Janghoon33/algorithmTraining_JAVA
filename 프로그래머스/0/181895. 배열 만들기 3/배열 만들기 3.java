import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] arr1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1]+1);
        int[] arr2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1]+1);
        
        int[] answer = Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).toArray();
        
        return answer;
    }
}