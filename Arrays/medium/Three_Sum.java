/*
Given an integer array nums. Return all triplets such that:
i != j, i != k, and j != k
nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets. 
One element can be a part of multiple triplets. The output and the triplets can be returned in any order.

Example 1
Input: nums = [2, -2, 0, 3, -3, 5]
Output: [[-2, 0, 2], [-3, -2, 5], [-3, 0, 3]]
Explanation:
nums[1] + nums[2] + nums[0] = 0
nums[4] + nums[1] + nums[5] = 0
nums[4] + nums[2] + nums[3] = 0

Example 2
Input: nums = [2, -1, -1, 3, -1]
Output: [[-1, -1, 2]]
Explanation:
nums[1] + nums[2] + nums[0] = 0
Note that we have used two -1s as they are separate elements with different indexes
But we have not used the -1 at index 4 as that would create a duplicate triplet

Constraints:
1 <= nums.length <= 3000
-104 <= nums[i] <= 104
*/



/*Brute:
we can use loops to iterate through all the indexes and find the triplets.
The time complexity ofy this code would be O(n^3) and space complextiy is O(2 * unique triplets).
code goes as shown below:
*/

import java.util.*;
class Solution{
  public List<List<Integer>> threeSum(int[] nums){
    int n = nums.length;
    Set<List<Integer>> sum = new HashSet<>();
    for(int i = 0; i < n;i++){
      for(int j = i + 1; j < n;j++){
        for(int k = j + 1; k < n; k++){
          List<Integer> triplet = new ArrayList<>();
          if(nums[i] + nums[j] + nums[k] == 0){
            triplet.add(nums[i]);
            triplet.add(nums[j]);
            triplet.add(nums[k]);
            Collection.sort(triplets);
            sum.add(triplets);
          }
        }
      }
      List<List<Integer>> ans = new ArrayList<>(sum);
      return ans;
    }
  }


// Better solution:
  // use hashset and store the third variable by traversing i and j pointers in the set and check whether the third variable is present
  // in the hastset, if present, store the entire triplet. we use two sets here to store the unique triplets and to check the k variable wherer all the triplets together make 0.

class Solution{
  public List<List<Integer>> threeSum(int[] nums){
    Set<List<Integer>> unique = new HashSet<>();
    for(int i = 0; i < n; i++){
      for(int j = i + 1; j < n;j++){
        Set<Integer> s = new HashSet<>();
        int third = -(nums[i] + nums[j]);
        if(s.contains(third)){
          List<Integer> temp = new ArrayList<>();
          temp.add(nums[i]);
          temp.add(nums[j]);
          temp.add(nums[k]);
          Collections.sort(temp);
          unique.add(temp);
        }
        s.add(nums[j]); // add the current element incase u didn't find third in the set.
      }
    }
    List<List<Integer>> ans = new ArrayList<>(unique);
    return ans;
  }
}
// time complexity : O(n^2)
// space complexity : O(n)


// optimal:
// here we use two pointer appraoch, inorder attain the better time complexity.

class Solution{
  public List<List<Integer>> threeSum(int[] nums){
    List<List<Integer>> ans = new ArrayList<>();
    int n = nums.length;
    Arrays.sort(nums);
    for(int i = 0; i < n;i++){
      if(i > 0 && nums[i] == nums[i+1]){
        continue;
      }
      int j = i + 1;
      int k = n - 1;
      while(j <k){
        int sum = nums[i] + nums[j] + nums[k];
        if(sum < 0) j++;
        else if(sum > 0) k--;
        else{
          List<Integer> temp = new ArrayList<>();
          temp.add(nums[i]);
          temp.add(nums[j]);
          temp.add(nums[k]);
          ans.adD(temp);
          j++;
          k--;
        }
      }
      while(nums[j] == nums[j - 1]) j++;
      while(nums[k] == nums[k+1]) k--;
      return ans;
    }
  }

  // time complexity : (nlogn) + O(n);
  // space complexity : O(n)
      
    
