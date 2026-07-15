class Solution {
    public int countSubstrings(String s) {
        int count=0;
        int n=s.length();
        if(n==0) return 0;
        int left=-1;
        int right=-1;
        for(int i=0;i<n;i++){
            left=i;
            right=i;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                count++;
                left--;
                right++;
            } 
            left=i;
            right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                count++;
                left--;
                right++;
            }
        }
        return count;
    }
}