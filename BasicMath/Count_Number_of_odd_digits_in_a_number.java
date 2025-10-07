/*
problem Statement:

You are given an integer n. You need to return the number of odd digits present in the number.
The number will have no leading zeroes, except when the number is 0 itself.

Examples:
Input: n = 5
Output: 1
Explanation: 5 is an odd digit.

Input: n = 25
Output: 1
Explanation: The only odd digit in 25 is 5.

*/

//code logic
class Solution {
    public int countOddDigit(int n) {
        int cnt = 0;
        if(n == 0) return 0;
        while(n > 0){
            int dig = n % 10;
            if(dig % 2 == 1){
                cnt++;
            }
            n = n/10;
        }
        return cnt;
    }
}

//Time complexity : O(log n) - because the number of iterations in the while loop depends on the number of digits in the input integer n, which is logarithmic with respect to n.
//space complexity : O(1) - uses a constant amount of extra space, regardless of the input size.
