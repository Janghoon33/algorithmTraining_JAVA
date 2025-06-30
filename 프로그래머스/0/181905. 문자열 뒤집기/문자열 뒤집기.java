class Solution {
    public StringBuilder solution(String str, int s, int e) {
        StringBuilder SB = new StringBuilder();
        StringBuilder reverseStr = new StringBuilder(str.substring(s,e+1));
        
        SB.append(str.substring(0,s)); 
        SB.append(reverseStr.reverse().toString());
        if(str.length() > e){
            SB.append(str.substring(e+1));    
        }
        
        return SB;
    }
}