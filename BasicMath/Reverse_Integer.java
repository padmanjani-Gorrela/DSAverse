/*
problem statement:

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21
*/

/*
Intution:

rem = x % 10 → Extracts the last digit of x.
Example: x = 123 → rem = 3.

newR = r * 10 + rem → Shifts digits of r left and adds the new one.
Example: if r = 32 and rem = 1, then newR = 321.

Overflow check:
Normally, (newR - rem) / 10 should equal r.

If overflow occurs, newR becomes a corrupted (wrapped) value, and
(newR - rem) / 10 != r, so return 0.

r = newR → Store the new reversed number.

x /= 10 → Drop the processed last digit.

*/
//Logic here
class Solution {
    public int reverse(int x) {
        int r = 0;
        while (x != 0) {
            int rem = x % 10;
            int newR = r * 10 + rem;
            if ((newR - rem) / 10 != r) {
                return 0;
            }
            r = newR;
            x /= 10;
        }
        return r;
    }
}
