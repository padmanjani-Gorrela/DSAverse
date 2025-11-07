/*
You are given a string, and you need to **compress it using Run-Length Encoding (RLE)**.
In this method, **each repeated group of the same character is replaced by:**

```
character + number of times it appears continuously
```
Example:
`"aaabbc"` → `"a3b2c1"`
*/
class Solution {
    public static String encode(String s) {
        if(s == null || s.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                cnt++;
            }else{
                sb.append(s.charAt(i-1)).append(cnt);
                cnt = 1;
            }
        }
        sb.append(s.charAt(s.length() - 1)).append(cnt);
        return sb.toString();
    }
}

/*
The for loop runs from index 1 → end of string.
It adds to the output only when the current char changes.
But the last group never gets added inside the loop — because there’s no next character to trigger the else block.
So we manually append the last character group after the loop.
*/

TIME AND SPACE COMPLEXITY:
/*
Time	O(n) — single pass through the string
Space	O(n) — for the output string (StringBuilder)
*/
