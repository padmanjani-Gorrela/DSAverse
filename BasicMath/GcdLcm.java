/* Problem Statement
1. Greatest Common Divisor (GCD):

Given two integers, a and b, find the largest positive integer that divides both a and b without leaving a remainder. This is also known as the Greatest Common Factor (GCF).

Example: For the numbers 54 and 24, the divisors are:

Divisors of 54: 1, 2, 3, 6, 9, 18, 27, 54
Divisors of 24: 1, 2, 3, 4, 6, 8, 12, 24
The greatest common divisor is 6.

2. Least Common Multiple (LCM):

Given two integers, a and b, find the smallest positive integer that is a multiple of both a and b.

Example: For the numbers 4 and 6, the multiples are:
Multiples of 4: 4, 8, 12, 16, 20, 24, ...
Multiples of 6: 6, 12, 18, 24, ...
The least common multiple is 12.
*/


import java.util.*;
public class GcdLcm {
    //GCD of the numbers
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    //LCM of the numbers
    public int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd(a, b);
    }
  //Main Method
    public static void main(String[] args) {
        GcdLcm calculator = new GcdLcm();
        int num1 = 54;
        int num2 = 24;
        int resultGcd = calculator.gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + resultGcd);
        int resultLcm = calculator.lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + resultLcm);
    }
}
