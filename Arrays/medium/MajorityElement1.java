/*
Given an integer array nums of size n, return the majority element of the array.
The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

Examples:
Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]
Output: 7
Explanation:
The number 7 appears 5 times in the 9 sized array

Input: nums = [1, 1, 1, 2, 1, 2]
Output: 1
Explanation:
The number 1 appears 4 times in the 6 sized array
*/

METHOD 1:
/*
Use a hashmap and store as (key, value) pairs. Here the key will be the element of the array and the value will be the number of times it occurs.
Traverse the array and update the value of the key. Simultaneously check if the value is greater than the floor of N/2. If yes, return the key, otherwise iterate forward.
*/
class Solution{
  public int Majority(int[] nums){
    int n = nums.length;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int num : nums){
      map.put(num,map.getOrDefault(num,0)+1);
    }

    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
      if(entry.getValue() > n/2){
        return entry.getKey();
      }
    }
    return -1;

  }
}

/*
Time complexity : O(n)
Space comeplexity : O(n)
*/

METHOD 2:
/*
Initialize 2 variables: countfor tracking the count of elements and element for keeping a track of the element we are counting.
Traverse through the given array. If count is 0 then store the current value of the array as element .
If the current array value andelement are the same increase the count by 1. If they are different decrease the count by 1. The integer present in element should be the result expected.
*/
class Solution{
  public int majortiyElement(int[] nums){
    int n = nums.length;
    int cnt = 0;
    int ele = 0;
    for(int i = 0; i < n;i++){
      if(cnt == 0){
        cnt = 1;
        ele = nums[i];
      }
      else if(ele == nums[i]){
        cnt++;
      }
      else{
        cnt--;
      }
    }
    int cnt1 = 0;
    for(int i =0; i <n;i++){
      if(ele == cnt1){
        cnt++;
      }
      if(cnt1 > n/2){
        return ele;
      }
    }
    return -1;
  }
}
/*
You have two passes through the array:

First loop:
Finds a potential candidate (ele) for the majority element.
But it does not guarantee that this element is truly the majority — it just gives a possible one.

Second loop:
Counts how many times that candidate actually appears.
If its count (cnt1) is greater than n / 2, you return it.
*/

/*
Time Complexity: O(N) + O(N)
Space Complexity: O(1) no extra space used.
*/
