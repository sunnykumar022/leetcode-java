class Solution {
    public int smallestNumber(int n, int t) {
        while(n<10){
            if(n<=t)return t;
            if(n%t==0)return n;
            n++;

        }
        int ones=n%10;
        n=n/10;

        while((ones*n)%t!=0 && ones <10){
            if((ones*n)%t==0) return (n*10)+ones;
            ones++;
        }
        if((ones*n)%t==0) return (n*10)+ones; 
        return (n+1)*10;

        
    }
}