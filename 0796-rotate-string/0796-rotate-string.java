class Solution {
    public boolean rotateString(String s, String goal) {
        String s2=s.concat(s);
        return s2.contains(goal) && s.length()==goal.length();

       
    }
}