class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            if(set.contains(s.substring(i,i+10))){
                list.add(s.substring(i,i+10));  
            }else{
                set.add(s.substring(i,i+10));
            }
        }
        HashSet<String> unique=new HashSet<>(list);
        return new ArrayList(unique);

    }
}