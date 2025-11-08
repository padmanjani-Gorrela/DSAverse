/*
Problem Statement

You are given a string s.
Your task is to count how many times each distinct character appears in the string, and then return a new compressed string formed by concatenating each character with its total count.
The order of characters in the output string does not matter (since a HashMap can be used), but you may optionally maintain the order of first appearance.

Input : s = "aaabbc"
Output : "a3b2c1"
*/

class Solution{
  public static String compress(String str){
    if(str == null || str.isEmpty()){

      Map<Character,Integer> map = new HashMap<>();
      for(char c : str.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
      }
      StringBuilder sb = new StringBuilder();
      for(Map.Entry<Character,Integer> entry : map.entryset()){
        sb.append(entry.getKey()).append(entry.getValue());
      }
      return sb.toString();
    }
  }

/*
Initialize a HashMap<Character, Integer> → to store each character’s count.
Iterate through each character in the input string:
Use map.put(ch, map.getOrDefault(ch, 0) + 1);
Initialize a StringBuilder.
Iterate over the map’s entry set: Append key (character) and value (count) to the builder.
Return builder.toString().
*/

