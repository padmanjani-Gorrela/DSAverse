/*
Given marks of a student, print on the screen:

Grade A if marks >= 90
Grade B if marks >= 70
Grade C if marks >= 50
Grade D if marks >= 35
Fail, otherwise.
*/
class Solution {
    public static void main(String[] args) {
      Scanner sc =  new Scanner(System.in);
      int marks = sc.nextInt();
        if(marks >= 90) System.out.print("Grade A");
        else if(marks >= 70) System.out.print("Grade B");
        else if(marks >= 50) System.out.print("Grade C");
        else if(marks >= 35) System.out.print("Grade D");
        else System.out.print("Fail");
    }
}
