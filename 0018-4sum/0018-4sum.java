class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hs=new HashSet<>();
        // List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
            int j=i+1;
            while(j<nums.length-2){
                int k=j+1;
                int l=nums.length-1;
                
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum== target){
                        List<Integer> row=new ArrayList<>();
                        row.add(nums[i]);
                        row.add(nums[j]);
                        row.add(nums[k]);
                        row.add(nums[l]);
                        hs.add(row);
                        k++;
                        l--;
                    }else if(sum>target){
                        l--;
                    }else{
                        k++;
                    }
                
                }
                j++;
            }
            

            
            
        }
        return new ArrayList(hs);
    }
}