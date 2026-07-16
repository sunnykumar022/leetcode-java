class Solution {
    public boolean halvesAreAlike(String s) {
        int left =0;
        int right=0;
        int i=(s.length())/2;
        int j=i;
        while(i>0 && j<=s.length()){
            char ch=s.toLowerCase().charAt(i-1);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u'){
                left++;

            }
            ch=s.toLowerCase().charAt(j);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u'){
                right++;

            }
            i--;
            j++;
        

        }
        return left==right;
    }
}