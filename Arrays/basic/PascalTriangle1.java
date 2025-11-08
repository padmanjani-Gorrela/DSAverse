/*
Given two integers r and c, return the value at the rth row and cth column (1-indexed) in a Pascal's Triangle.
In Pascal's triangle:
The first row contains a single element 1.
Each row has one more element than the previous row.
Every row starts and ends with 1.
For all interior elements (i.e., not at the ends), the value at position (r, c) is computed as the sum of the two elements directly above it from the previous row:

Pascal[r][c]=Pascal[r−1][c−1]+Pascal[r−1][c]
where indexing is 1-based

Examples:
Input: r = 4, c = 2
Output: 3
Explanation:
The Pascal's Triangle is as follows:
1
1 1
1 2 1
1 3 3 1
....
Thus, value at row 4 and column 2 = 3

*/
class Solution{
  public int pascal(int r, int c){
    return rc(r - 1,c-1);
  }
  private int rc(int r,int c){
    if(r > n - r) r = n - r;
    if(r == 1) return n;
    int res = 1;
    for(int i = 0;i < r;i++){
      res = res * (n - i);
      res = res / (i + 1);
    }
    return res;
  }
}
