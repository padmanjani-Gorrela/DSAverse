/*
Given: "a2b3a2"
Goal: "aabbb aa"

You need to:
Traverse the string
Identify a character
Read the number that follows it
Append that character to the result count times
*/
public class RunLengthDecoding {
    public static String decode(String s) {
        if (s == null || s.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        char ch = s.charAt(0); // to store the character

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                int count = c - '0'; // convert '3' -> 3
                for (int j = 0; j < count; j++) {
                    sb.append(ch);
                }
            } else {
                ch = c; // update to new character
            }
        }

        return sb.toString();
    }
  
    public static void main(String[] args) {
        System.out.println(decode("a2b3a2")); // aabbbaa
        System.out.println(decode("a3b2c1")); // aaabbc
    }
}
