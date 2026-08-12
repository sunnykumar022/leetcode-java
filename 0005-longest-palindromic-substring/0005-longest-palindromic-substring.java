class Solution {
    public String longestPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        int len=0;
        for(int i=0;i<s.length();i++){
            int j=i+1;
            while(j<=s.length()){

                if(isPalindrome(s.substring(i,j)) &&  s.substring(i,j).length()>len){

                    sb=new StringBuilder( s.substring(i,j));
                
                    len=Math.max(len,s.substring(i,j).length());
                }
                j++;
            }
        }
        return sb.toString();
    }
    static boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char l=s.charAt(left);
            char r=s.charAt(right);
            if(l!=r){
                return false;
            }
            left++;
            right--;


        }
        return true;
    }
}