class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr=new int[nums.length];
        for(int i=0;i<n;i++){
            arr[i*2]=nums[i];
        }
        int j=n-1;
        for(int i=n;i<2*n;i++){
            
            arr[i-j]=nums[i];
            j--;
        }
        return arr;
    }
}