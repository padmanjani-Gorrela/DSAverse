/*
Ezio can manipulate at most X number of guards using the Apple of Eden.
Given that there are Y guards present, determine whether Ezio can safely manipulate all of them.
If Ezio can control all the guards (i.e., X ≥ Y), print "YES".
Otherwise, print "NO".

Input Format
The first line contains an integer T, the number of test cases.
Each of the next T lines contains two integers X and Y —
X: Number of guards Ezio can manipulate
Y: Number of guards present

Output Format
For each test case, print "YES" if Ezio can manipulate all the guards,
otherwise print "NO".
(Output is case-insensitive — “yes”, “Yes”, or “YES” are all accepted.)
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++){
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    
		    if(X >= Y) System.out.println("yes");
		    else System.out.println("no");
		}

	}
}
