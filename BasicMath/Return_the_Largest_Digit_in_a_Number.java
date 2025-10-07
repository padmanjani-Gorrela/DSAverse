/*
problem Statement:

You are given an integer n. Return the largest digit present in the number.

Examples:
Input: n = 25
Output: 5
Explanation: The largest digit in 25 is 5.

Input: n = 99
Output: 9
Explanation: The largest digit in 99 is 9.

*/

//code logic
class Solution {
    public int largestDigit(int n) {
        int maxDigit = 0;
        while(n > 0){
            int digit = n % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            } 
            n /= 10;
        }
        return maxDigit;
    }
}

//Time Complexity:O(log(n)) where n is the input number because the number of iterations depends on the number of digits in n, which is logarithmic with respect to n.
//Space Complexity:O(1) as it uses a constant amount of extra space regardless of the input.
