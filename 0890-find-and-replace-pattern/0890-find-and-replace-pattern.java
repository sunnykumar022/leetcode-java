class Solution {
    static String createMapping(String s){
        int n=s.length();
        char []arr=new char[256];
        char start='a';
        for(int i=0;i<n;i++){
            if(arr[s.charAt(i)]==0){

            arr[s.charAt(i)]=start;
            start++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(arr[s.charAt(i)]);
        }
        return sb.toString();
    }
    static boolean isMatch(String s,String pattern){
        String str1=createMapping(s);
        String str2=createMapping(pattern);
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
    
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list=new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            if(isMatch(words[i],pattern)){
                list.add(words[i]);
            }
        }
        return list;
    }
}