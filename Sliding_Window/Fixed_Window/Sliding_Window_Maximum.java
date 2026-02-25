/*
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
Return the max sliding window.

Example 1:
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
 
*/

/*
We maintain a deque of indices such that:
Elements in deque are in decreasing order
Front of deque = maximum of current window
Why indices?  to remove elements leaving window.
*/



/*
Deque template:
for (int r = 0; r < n; r++) {
    // 1. Remove out-of-window indices
    while (!dq.isEmpty() && dq.peekFirst() <= r - k)
        dq.removeFirst();

    // 2. Maintain monotonic order
    while (!dq.isEmpty() && nums[dq.peekLast()] < nums[r])
        dq.removeLast();

    // 3. Add current index
    dq.addLast(r);

    // 4. Window formed
    if (r >= k - 1)
        ans.add(nums[dq.peekFirst()]);
}
*/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> q = new ArrayDeque<>();
        int ind = 0;
        for(int i = 0; i < n;i++){
            if(!q.isEmpty() && q.peekFirst() <= i - k){
                q.removeFirst();
            }
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.removeLast();
            }
            q.addLast(i);
            if(i >= k - 1){
                ans[ind] = nums[q.peekFirst()];
                ind++;
            }
        }
        return ans;
    }
}
