class Solution {
    static int binary(int nums[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]==target) return mid;
        if(nums[mid]<target){
            return binary(nums,target,mid+1,end);
        }
        return binary(nums,target,start,mid-1);
        
    }
    public int search(int[] nums, int target) {
        int ans=binary(nums, target,  0,nums.length-1);
        return ans;
    }
}