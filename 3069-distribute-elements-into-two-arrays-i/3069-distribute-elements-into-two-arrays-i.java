class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        
        // Operation 1 & 2: First element goes to arr1, second to arr2
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        
        // Subsequent operations based on last element comparison
        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }
        
        // Concatenate arr1 and arr2 into the result array
        int[] result = new int[nums.length];
        int idx = 0;
        
        for (int val : arr1) {
            result[idx++] = val;
        }
        for (int val : arr2) {
            result[idx++] = val;
        }
        
        return result;
    }
}