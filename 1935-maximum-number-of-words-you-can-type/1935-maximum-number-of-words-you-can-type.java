class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int freq[]=new int[26];
        for(int i=0;i<brokenLetters.length();i++){
            freq[brokenLetters.charAt(i)-'a']++;
        }
        int i=0;
        int count=0;
        boolean valid =false;
        while(i<text.length()){
            if(text.charAt(i)== ' '){
                    count++;
                    i++;
            }
            if(freq[text.charAt(i)-'a']>0){
                while(i<text.length() && text.charAt(i) != ' '){
                    i++;
                }
                i++;
                valid=false;
            }
            else{
               valid =true; 

            i++;
            }
        }
        if (valid) count++; 
            
        
        return count;
    }
}