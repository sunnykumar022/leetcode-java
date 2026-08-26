class Solution {
    private int binarySearch(int[] arr,int target,boolean first){
        int n=arr.length;
        int l=0;
        int r=n-1;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==target){
                ans=m;
                if(first){
                    r=m-1;
                }else{
                    l=m+1;
                }

            }else if(arr[m]<target){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=binarySearch(nums,target,true);
        int last=binarySearch(nums,target,false);
        return new int[]{first,last};        
        
    }
}