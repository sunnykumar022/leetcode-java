class Solution {
    public int arraySign(int[] nums) {
         boolean negative=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                negative=!negative;
            }
        }
        if(negative) return -1;
        return 1;
    }
}