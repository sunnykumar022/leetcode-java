class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // We are in a descending slope, peak must be at mid or to the left
                right = mid;
            } else {
                // We are in an ascending slope, peak must be to the right
                left = mid + 1;
            }
        }

        return left;
    }
}