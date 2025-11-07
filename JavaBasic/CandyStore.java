/*
Problem Statement
Chef works at a candy store that has 100 chocolates.
His daily goal is to sell X chocolates.
For each chocolate he sells (up to X), he earns 1 rupee each.
For every chocolate beyond X, he earns 2 rupees each (as a bonus).
If Chef sells Y chocolates in a day, find the total amount of money he makes.

Input Format
The first line contains an integer T, the number of test cases.
Each test case contains two space-separated integers:
X → daily sales goal
Y → actual chocolates sold

Output Format
For each test case, print the total rupees Chef earns.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int total = 0;
            if(Y <= X){
                total = Y * 1;
            }
            else{
                total = (X * 1) + ((Y - X) * 2);
            }
            System.out.println(total);
        }
    }
}
