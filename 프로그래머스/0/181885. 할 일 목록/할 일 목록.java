import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.Arrays;



class Solution {
    public List<String> solution(String[] todo_list, boolean[] finished) {
        List<Integer> list = IntStream.range(0, finished.length)
            .filter(i -> !finished[i])
            .boxed()
            .collect(Collectors.toList());
        
        List<String> answer = list.stream()
            .map(i -> todo_list[i])
            .collect(Collectors.toList());

        return answer;
    }
}