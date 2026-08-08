class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int end=nums.length-1;
            int start=i+1;
            while(start<end){
                    List<Integer> row=new ArrayList<>();
                    if(nums[i]+nums[start]+nums[end]==0){
                        row.add(nums[i]);
                        row.add(nums[start]);
                        row.add(nums[end]);
                        // Collections.sort(row);
                        list.add(row); 
                        start++;
                        end--;
                    }else if(nums[i]+nums[start]+nums[end]<0){
                        start++;
                    }else end--;
                
            }
        }
        
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}