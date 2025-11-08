/*
Given an integer array nums of even length consisting of an equal number of positive and negative integers.Return the answer array in such a way that the given conditions are met:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.

Examples:
Input : nums = [2, 4, 5, -1, -3, -4]
Output : [2, -1, 4, -3, 5, -4]
Explanation:
The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4 maintain their relative positions

Constraints:
2 <= nums.length <= 105
1 <= | nums[i] | <= 104
nums.length is an even number.
Number of positive and negative numbers are equal.
*/

METHOD 1:
/*
Since the number of positive and negative elements are the same, we put positives into an array called “pos” and negatives into an array called “neg”.
After segregating each of the positive and negative elements, we start putting them alternatively back into the original array.
Initialize an array which will run from 0 till (sizeOfArray/2 - 1) because the number of positive and negative elements are equal, so the total count of any of them will be equal to (sizeOfArray/2).
Since the array must begin with a positive number and the start index is 0, so all the positive numbers would be placed at even indices (2*i) and negatives at the odd indices (2*i+1), where i is the index of the pos or neg array while traversing them simultaneously.
*/

class Solution{
  public int[] posneg(int[] nums){
    int n = nums.length;
    List<Integer> pos = new ArrayList<>();
    List<Integer> neg = new ArrayList<>();
    for(int i = 0; i < n;i++){
      if(nums[i] > 0) pos.add(nums[i]);
      else neg.add(nums[i]);
    }
    for(int i = 0; i < n/2;i++){
      nums[2 * i] = pos.get(i);
      nums[2 * i + 1] = neg.get(i);
    }
    return nums;
  }
}
/*
Time Complexity: O(N+N/2)
Space Complexity: O(N/2 + N/2) = O(N)
*/

METHOD 2:
/*
Initialize two variable posIndex as 0 and negIndex as 1 initially.
Now, iterate in the array & on encountering the first negative element, understand that its first position in resultant array should be starting from index 1, as initially positive number will be placed. And then each time when a negative number is found, its next position would be 2 steps ahead considering that a positive number will occupy space in between 2 negative numbers. So increment the position of negative number by 2.
Similarly, when you encounter the first positive element, it occupies the position at index 0 in the resultant array, and then each time on finding a positive number, put it on the posIndex and it increments by 2.
When both the negIndex and posIndex exceed the size of the array, stop the iteration as the whole array is now rearranged alternatively according to the sign.
*/
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        int n = nums.length;
        int posInd = 0, negInd = 1;
        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                ans[negInd] = nums[i];
                negInd+=2;
            }
            else{
                ans[posInd] = nums[i];
                posInd += 2;
            }
        }
        return ans;
    }
}
/*
Time Complexity: O(N), for traversing the array only once where N is the length of the array.
Space Complexity: O(N) to store the resultant array.
*/
