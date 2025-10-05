/*
Problem Statement:

Write a function that takes a positive integer n as input and returns a list of all prime numbers less than or equal to n.

Constraints:
n will be a non-negative integer.

Example:
If the input n is 50, the output should be:
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]
*/ 

import java.util.*;
public class SieveOfEratosthenes {
    public List<Integer> primeList(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        SieveOfEratosthenes sieve = new SieveOfEratosthenes();
        int n = 50;
        System.out.println("Finding prime numbers up to " + n + ":");
        List<Integer> primes = sieve.primeList(n);
        System.out.println(primes);
    }
}

