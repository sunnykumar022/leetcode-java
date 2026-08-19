class Solution {
    public boolean detectCapitalUse(String word) {
       int count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)<97){
                count++;
            }
        }
        if(count==0) return true;
        if(count ==word.length()) return true;
        if(count==1 && word.charAt(0) < 97) return true;
        return false;
    }
}