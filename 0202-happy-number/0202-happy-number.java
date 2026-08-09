class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        if(n==4) return false;
        int sum=0;
        while(n>0){
            sum+=(n%10)*(n%10);
            n/=10;
        }
        return isHappy(sum);
    }
}

// 2 ,4, 16, 37 ,58,81,65,61,37
// 12,5,25,29,85,89,81+64=145,44,32,13,10,1
// 13,10,1
// 14,17,50,25,29,,,1
// 15,26,40,16,37