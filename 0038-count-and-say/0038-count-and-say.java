class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s="1";
        for(int i=1;i<n;i++){
            StringBuilder sb=new StringBuilder();
            int a=0;
            while(a<s.length()){
                int j=a;
                int count=1;
                while((j+1)<s.length() && s.charAt(j)==s.charAt(j+1)){
                    count++;
                    j++;
                    
                }
                sb.append(count);
                sb.append(s.charAt(j));
                a=j+1;
            }

            
            s=sb.toString();
        }
        return s;
    }
}