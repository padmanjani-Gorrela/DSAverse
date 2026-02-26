/*
Given an integer k and a string s, any character in the string can be selected and changed to any other uppercase English character. This operation can be performed up to k times. After completing these steps, return the length of the longest substring that contains the same letter.

Example 1
Input : s = "BAABAABBBAAA" , k = 2
Output : 6
Explanation : we can change the B present at index 0 , 3 (0 base indexing) to A.
The new string is "AAAAAABBBAAA".
The substring "AAAAAA" is the longest substring having same letter with length 6.

Example 2
Input : s = "AABABBA" , k = 1
Output : 4
Explanation : The underlined characters are changed in the new string obtained.
The new string is "AABBBBA". The substring "BBBB" is the answer.
There are other ways to achieve this answer.
*/

class Solution {
    public int characterReplacement(String s, int k){
      int n = s.length();
      int l = 0,r = 0;
      int[] hash = new int[n];
      Arrays.fill(hash,0);
      int maxfrq = 0;
      while(r < n){
        hash[s.charAt(r) - 'A']++;
        maxfreq = Math.max(maxfreq, hash[s.charAt(r)-'A']);
        if(((r - l+ 1) - maxfreq) > k){
          hash[s.charAt(l) - 'A']--;
          l++;
        }
        maxlen = Math.max(maxlen, r - l + 1);
        r++;
      }
      return maxlen;
    }
}
