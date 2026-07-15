class Solution {
    public String decodeMessage(String key, String message) {
        char []arr=new char[256];
        char start='a';
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(ch==' ') continue;
            else if(arr[ch]==0){
                arr[ch]=start;
                start++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<message.length();i++){
            char c=message.charAt(i);
            if(c==' '){
                sb.append(' ');

            }
            else{
                sb.append(arr[c]);
            }
        }
        return sb.toString();


    }
}