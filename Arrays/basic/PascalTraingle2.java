/*
Given an integer r, return all the values in the rth row (1-indexed) in Pascal's Triangle in correct order.

In Pascal's triangle:
The first row has one element with a value of 1.
Each row has one more element in it than its previous row.
The value of each element is equal to the sum of the elements directly above it when arranged in a triangle format.

Examples:
Input: r = 4
Output: [1, 3, 3, 1]
Explanation:

The Pascal's Triangle is as follows:

1
1 1
1 2 1
1 3 3 1
....
Thus the 4th row is [1, 3, 3, 1]
*/

class Solution{
  public int[] pascal(int r){
    int[] ans = new int[r];
    ans[0] = 1;
    for(int i = 1; i < r; i++){
      ans[i] = ans[i - 1]*(r-i);
      ans[i] = ans[i]/i;
    }
    return ans;
  }
}
