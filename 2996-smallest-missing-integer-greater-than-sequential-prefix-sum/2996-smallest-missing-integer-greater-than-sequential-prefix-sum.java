class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int j=1;j<nums.length;j++){
            if(nums[j]==nums[j-1]+1){
                sum+=nums[j];
            }   
            else{
                break;
            }
        }
        while(search(nums,sum)==true){
            sum++;
        }
        return sum;
       
    }
    public boolean search(int nums[],int sum){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==sum) return true;
        }
            return false;
    }
}