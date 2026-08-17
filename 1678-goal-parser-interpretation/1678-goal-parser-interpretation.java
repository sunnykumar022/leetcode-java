class Solution {
    public String interpret(String command) {
     StringBuilder sb=new StringBuilder();
     int i=0;

     while(i<command.length()){
        
       
        if(command.charAt(i)=='('){
            if(command.charAt(i+1)==')'){
                sb.append('o');
                i+=2;
            }else{
                while(command.charAt(i+1)!=')'){
                    sb.append(command.charAt(i+1));
                    i++;
                }
                i+=2;

            }
        }else{
            

            sb.append(command.charAt(i));
            i++;
            
        }
     } 
     return sb.toString(); 
    }
}