class Solution {
    private static int Gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int max=0;
        //find max
        
        int prifixGcd[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
            prifixGcd[i]=Gcd(nums[i],max);
        }
        Arrays.sort(prifixGcd);
        int i=0;
        int j=prifixGcd.length-1;
        long sum=0;
        while(i<j){
            sum+=Gcd(prifixGcd[i],prifixGcd[j]);
            i++;
            j--;

        }
        return sum;
    }
}