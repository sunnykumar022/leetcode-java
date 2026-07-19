class Solution {
    public String smallestSubsequence(String s) {
        
        int[] freq = new int[26];   // frequency of each char
        boolean[] used = new boolean[26]; // track if char is already in result
        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            freq[c - 'a']--; // one occurrence used
            
            if (used[c - 'a']) continue; // skip if already in stack
              // maintain lexicographically smallest order
            while (!stack.isEmpty() && stack.peek() > c && freq[stack.peek() - 'a'] > 0) {
                used[stack.pop() - 'a'] = false;
            }
            
            stack.push(c);
            used[c - 'a'] = true;
        }
        
        // build result
        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        
        return sb.toString();
    }
}