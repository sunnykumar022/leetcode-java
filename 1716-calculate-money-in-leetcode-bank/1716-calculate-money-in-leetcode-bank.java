class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int a=n/7;
        int start=1;
        for(int i=0;i<a;i++){
           
            for(int j=0;j<7;j++){
                sum=sum+start+j;
            }
            start++;
        }

        if(n%7>0){
            for(int i=0;i<n%7;i++){
                sum=sum+start+i;
            }
        }
        return sum;
    }
}