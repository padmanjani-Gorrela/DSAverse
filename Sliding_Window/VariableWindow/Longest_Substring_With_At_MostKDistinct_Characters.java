/*
Given a string s and an integer k.Find the length of the longest substring with at most k distinct characters.

Example 1
Input : s = "aababbcaacc" , k = 2
Output : 6
Explanation : The longest substring with at most two distinct characters is "aababb".

The length of the string 6.

Example 2
Input : s = "abcddefg" , k = 3
Output : 4
Explanation : The longest substring with at most three distinct characters is "bcdd".

The length of the string 4.
*/

class Solution {
    public int kDistinctChar(String s, int k) {
        int n = s.length();
       int maxlen = 0;
       Map<Character,Integer> mp = new HashMap<>();
       int l = 0,r = 0;
       while(r < n){
        mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r),0)+1);

        if(mp.size() > k){
            mp.put(s.charAt(l), mp.get(s.charAt(l)) - 1);

            if(mp.get(s.charAt(l)) == 0){
                mp.remove(s.charAt(l));
            }
            l++;
        }
        if(mp.size() <= k){
            maxlen = Math.max(maxlen, r -l + 1);
        }
        r++;

       }
       return maxlen;
    }
}
  
