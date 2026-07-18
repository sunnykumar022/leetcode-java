class Solution {
    //Find greatest common divisor
    private static int Gcd(int a,int b){
        while(a!=0){
            int temp =a;
            a=b%a;
            b=temp;
        }
        return b;
    } 
    public int findGCD(int[] nums) {
        int small=nums[0];
        int large=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large){
                large=nums[i];
            }
            if(nums[i]<small){
                small=nums[i];
            }
        }
        return Gcd(small,large);
    }
}