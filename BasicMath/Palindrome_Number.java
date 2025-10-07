/*
Problem Statement:

You are given an integer n. You need to check whether the number is a palindrome number or not. Return true if it's a palindrome number, otherwise return false.
A palindrome number is a number which reads the same both left to right and right to left.

Examples:
Input: n = 121
Output: true
Explanation: When read from left to right : 121.
When read from right to left : 121.

*/

//code logic here
class Solution {
    public boolean isPalindrome(int n) {
        int org = n;
        int rev = 0;
        while(n>0){
            int dig = n % 10;
            rev = rev*10 + dig;
            n = n/10; 
        }
        if(org == rev){
            return true;
        }
        else{
            return false;
        }
    }
}

//Time Complexity:O(log(n)) due to the while loop that iterates through the digits of n
//Space Complexity: O(1) because it uses a constant amount of extra space.
