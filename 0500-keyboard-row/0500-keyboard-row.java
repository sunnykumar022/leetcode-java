class Solution {
    public String[] findWords(String[] words) {
        String r1="qwertyuiop";
        String r2="asdfghjkl";
        String r3="zxcvbnm";
        List<String> list=new ArrayList<>();
       
        for(int i=0;i<words.length;i++){
             int arr[]=new int[3];
            int n=words[i].length();
            int j=0;
            while(j<n){
                if(r1.indexOf(words[i].toLowerCase().charAt(j))!=-1){
                    arr[0]=1;
                }
                if(r2.indexOf(words[i].toLowerCase().charAt(j))!=-1){
                    arr[1]=1;
                }
                if(r3.indexOf(words[i].toLowerCase().charAt(j))!=-1){
                    arr[2]=1;
                }
                j++;
            }
            if(arr[0]+arr[1]+arr[2]==1){
                list.add(words[i]);
            }

        }
        String []str=new String[list.size()];
        for(int i=0;i<list.size();i++){
            str[i]=list.get(i);
        }
        return str;
    }
}