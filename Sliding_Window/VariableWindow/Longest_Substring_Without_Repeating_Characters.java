/*
Given a string, S. Find the length of the longest substring without repeating characters.
Example 1
Input : S = "abcddabac"
Output : 4
Explanation : The answer is "abcd" , with a length of 4.
*/

// code
class Solution{
  public int lengthOfLongestSubstring(String s) {
    int l = 0;
    int ans = 0;
    Map<Character,Integer> mp = new HashMap<>();
    for(int r = 0; r < n;r++){
      int c = s.charAt(r);
      while(mp.containsKey(c) && mp.get(c) >= l){
        l = mp.get(c)+1;
      }
      mp.put(c,r);
      ans = Math.max(ans, r - l + 1);
    }
  return ans;
  }
}
//here what we are doing is, putting all the unseen characters into the map and then when the seen character triggers, the l moves the window to the index 
// right after the l, and then calculate the length
  
