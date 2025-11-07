/*
Pass the Exam
Chef appeared for an exam consisting of 3 sections. Each section is worth 100 marks
Chef scored 
A marks in Section 1
B marks in section 2
C marks in section 3


Chef passes the exam if both of the following conditions satisfy:

Total score of Chef is ≥100

Score of each section ≥10

Determine whether Chef passes the exam or not.

Input Format
A,B,C - Chef's score in each of the sections.
Output Format
For each test case, output PASS if Chef passes the exam, FAIL otherwise.
Note that the output is case-insensitive i.e. PASS, Pass, pAsS, and pass are all considered same.
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
		for(int i = 0; i < T;i++){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    int totalscore = A + B + C;
		    if(totalscore >= 100 && A >= 10 && B >= 10 && C >= 10){
		        System.out.println("pass");
		    }else System.out.println("fail");
		}

	}
}
