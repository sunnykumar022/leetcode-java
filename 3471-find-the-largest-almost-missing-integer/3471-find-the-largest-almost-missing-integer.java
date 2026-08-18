class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        //k==n ->return maximum element in entire array
        if(k==n){
            int max=nums[0];
            for(int num:nums){
                max=Math.max(max,num);
            }
            return max;
        }
        Map<Integer,Integer>freq=new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        if(k==1){
            int max=-1;
            for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
                if(entry.getValue()==1){
                    max=Math.max(max,entry.getKey());
                }
            }
            return max;
        }

       int ans=-1;
       if(freq.get(nums[0])==1){
        ans=Math.max(ans,nums[0]);
       }
       if(freq.get(nums[n-1])==1){
        ans=Math.max(ans,nums[n-1]);
       }
        return ans;

    }
}