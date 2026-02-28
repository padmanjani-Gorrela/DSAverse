/*
Given an array arr of size n, where each element arr[i] represents the stock price on day i. Calculate the span of stock prices for each day.
The span Si for a specific day i is defined as the maximum number of consecutive previous days (including the current day) for which the stock price was less than or equal to the price on day i.

Example 1

Input: n = 7, arr = [120, 100, 60, 80, 90, 110, 115]
Output: [1, 1, 1, 2, 3, 5, 6]
Explanation:
Traversing the given input span:
120 is greater than or equal to 120 and there are no more elements behind it so the span is 1,
100 is greater than or equal to 100 and smaller than 120 so the span is 1,
60 is greater than or equal to 60 and smaller than 100 so the span is 1,
80 is greater than or equal to 60, 80 and smaller than 100 so the span is 2
90 is greater than or equal to 60, 80, 90 and smaller than 100 so the span is 3,
110 is greater than or equal to 60, 80, 90, 100, 110 and smaller than 120 so the span is 5,
115 is greater than or equal to all previous elements and smaller than 120 so the span is 6.
Hence the output will be 1 1 1 2 3 5 6.
*/

// Brute:
class Solution{
  public int[] stockSpan(int[] nums){
    int n = nums.length;
    int[] ans = new int[n];
    for(int i = 0; i < n;i++){
      int currspan = 0;
      for(int j = i; j >= 0; j--){
        if(nums[j] <= nums[i]){
          currspan++;
        else break;
      }
      ans[i] = currspan;
    }
    return ans;
  }
}

//optimal:
class Solution{
  public int[] stockSpan(int nums){
  }
  private int[] PGE(int[] nums){
    int n = nums.length;
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[n];
    for(int i =0; i < n;i++){
      while(!st.isEmpty() && nums[st.peek()] <= nums[i]){
        st.pop();
      }
      ans[i] = st.isEmpty() ? -1 : st.peek();
      st.push(i);
    }
    return ans;
  }
}


//Leetcode style solution
class StockSpanner {
    Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!st.isEmpty() && price >= st.peek()[0]){
            span += st.peek()[1];
            st.pop();
        }
        st.push(new int[]{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
    
