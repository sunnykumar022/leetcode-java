class Solution {
    public String toGoatLatin(String sentence) {
        String[]words=sentence.split(" ");
        int count=1;
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<words.length;i++){
            String word=words[i];
            char ch=word.charAt(0);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                ans.append(word);
            }else{
                ans.append(word.substring(1));
                ans.append(ch);
            }
            ans.append("ma");
            for(int j=1;j<=count;j++){
                ans.append("a");
            }
            if(i!=words.length-1){
                ans.append(" ");
            }
            count++;

        }
        return ans.toString();
    }
}