/*
Problem Statement: Given an array containing both positive and negative integers, we have to find the length of the longest subarray with the sum of all elements equal to zero.

Example:
Input:
 N = 6, array[] = {9, -3, 3, -1, 6, -5}  
Result:
 5  
Explanation:
 The following subarrays sum to zero:
- {-3, 3}
- {-1, 6, -5}
- {-3, 3, -1, 6, -5}
The length of the longest subarray with sum zero is 5.
*/

/*
naive solution:
geenrate all the subarrays and check the longest length of the subarray where zero occurs.
codes goes like this:
*/

class Solution {
    public int subarrayZero(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;   // reset for each start
            for (int j = i; j < n; j++) {
                sum += nums[j];   // extend subarray
                if (sum == 0) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}
// complexities:
// time : O(n²)
// space : O(1)

// optimal:

class Solution{
  public int subarrayZero(int[] nums){
    int n = nums.length;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    int sum = 0, maxLen = 0;
    for (int i = 0; i < n; i++) {
        sum += nums[i];
        if (map.containsKey(sum)) {
            maxLen = Math.max(maxLen, i - map.get(sum));
        } else {
            map.put(sum, i);
        }
    }
    return maxLen;
  }
}

// complexities:
// time complexity: O(n)
// space complexity: O(n)
