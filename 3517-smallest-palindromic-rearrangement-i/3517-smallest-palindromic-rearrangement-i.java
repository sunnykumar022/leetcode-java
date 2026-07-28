class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        String firstHalf=s.substring(0,n/2);
        char[] arr=firstHalf.toCharArray();
        Arrays.sort(arr);
        StringBuilder ans=new StringBuilder();
        ans.append(arr);
        if(n%2==1){
            ans.append(s.charAt(n/2));

        }
        for(int i=arr.length-1;i>=0;i--){
            ans.append(arr[i]);
        }
        return ans.toString();
    }
}