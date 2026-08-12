class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> hs=new HashSet<>();
            int j=i;
            while(j<s.length() && !hs.contains(s.charAt(j))){
                hs.add(s.charAt(j));
                j++;
            }
            length=Math.max(length,hs.size());


        }
        return length;
    }
}