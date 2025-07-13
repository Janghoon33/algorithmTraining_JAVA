class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= idx && arr[i] == 1) {
                return answer = i;
            }
        }
        return -1;
    }
}