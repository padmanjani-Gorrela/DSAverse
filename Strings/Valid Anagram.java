/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Examples:
Input : s = "anagram" , t = "nagaram"
Output : true
Explanation :
We can rearrange the characters of string s to get string t as frequency of all characters from both strings is same.
*/

METH0D 1:
/*
Sorting Both Strings (O(n log n))

Idea:
If two strings are anagrams, sorting their characters will result in identical strings.
*/
import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car"));         // false
    }
}


METHOD 2:
/*
Using HashMap to Count Frequency (O(n))

Idea:
Count frequency of each character in s
Decrease the same count while scanning t
If all counts end at zero, it’s an anagram
*/
import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
        if (!map.containsKey(ch)) return false;
        map.put(ch, map.get(ch) - 1);
        if (map.get(ch) == 0) map.remove(ch);  // remove char completely
        }
        return map.isEmpty(); // all matched?
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("rat", "car"));       // false
    }
}

METHOD 3:
/*
Optimal Solution — Fixed-Size Array (O(n), O(1))

Idea:
If the problem guarantees lowercase English letters only (a–z),
you can replace the HashMap with a fixed-size int[26] array — faster & lighter.
*/
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count)
            if (val != 0) return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car"));         // false
    }
}

