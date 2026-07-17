class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
          int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        // Frequency of each number
        int[] freq = new int[max + 1];
        for (int x : nums) {
            freq[x]++;
        }

        // cntDiv[g] = numbers divisible by g
        long[] cntDiv = new long[max + 1];
        for (int g = 1; g <= max; g++) {
            for (int j = g; j <= max; j += g) {
                cntDiv[g] += freq[j];
            }
        }

        // exact[g] = pairs whose gcd is exactly g
        long[] exact = new long[max + 1];

        for (int g = max; g >= 1; g--) {
            long cnt = cntDiv[g];
            long pairs = cnt * (cnt - 1) / 2;

            for (int j = g * 2; j <= max; j += g) {
                pairs -= exact[j];
            }

            exact[g] = pairs;
        }

        // Prefix sum of pair counts
        long[] prefix = new long[max + 1];
        for (int g = 1; g <= max; g++) {
            prefix[g] = prefix[g - 1] + exact[g];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long k = queries[i] + 1;   // 0-indexed query

            int left = 1, right = max;
            while (left < right) {
                int mid = left + (right - left) / 2;

                if (prefix[mid] >= k)
                    right = mid;
                else
                    left = mid + 1;
            }

            ans[i] = left;
        }

        return ans;
    } 
}