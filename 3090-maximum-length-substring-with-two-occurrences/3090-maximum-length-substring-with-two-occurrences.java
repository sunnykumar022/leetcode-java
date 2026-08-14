class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int size=0;
        for(int i=0;i<n;i++){
            int j=n;
            while(j>=i){
                boolean br=false;
                String str=s.substring(i,j);
                int arr[]=new int[26];
                for(int k=0;k<=j-i-1;k++){
                    arr[str.charAt(k)-'a']++;
                    if(arr[str.charAt(k)-'a']>2){
                        br=true;
                        break;
                    }
                }
                if(br==false){
                    size=Math.max(size,str.length());
                }
                j--;

                
            }
        }
        return size;
    }
}