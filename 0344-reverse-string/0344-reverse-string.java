class Solution {
    static char[] reverse(char[]s,int start,int end){
        if(start>end){
            return  s;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        return reverse(s,start+1,end-1);
    }
    public void reverseString(char[] s) {
        s=reverse(s,0,s.length-1);
    }
}