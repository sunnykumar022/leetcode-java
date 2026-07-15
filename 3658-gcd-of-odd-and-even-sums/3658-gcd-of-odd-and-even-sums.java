class Solution {

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int oddSum = n * n;          // Sum of first n odd numbers
        int evenSum = n * (n + 1);   // Sum of first n even numbers

        return gcd(oddSum, evenSum);


        
    }
    
}