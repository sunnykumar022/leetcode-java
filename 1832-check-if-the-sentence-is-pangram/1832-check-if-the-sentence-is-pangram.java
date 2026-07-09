class Solution {
    public boolean checkIfPangram(String sentence) {
        char []ch=sentence.toCharArray();
        Arrays.sort(ch);
        int sum=97;
        for(int i=1;i<ch.length;i++){
           if(ch[i]==ch[i-1]){
            continue;
           }else if((ch[i-1])!=sum){
            return false;
           }else{
            sum++;
           }
            
           
            

        }
        if(ch[ch.length-1]!='z') return false;

        return sum==122;
    }
}