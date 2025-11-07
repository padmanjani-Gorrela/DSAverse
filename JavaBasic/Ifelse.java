/*
Given an integer age, print on the screen:

Adult if age >= 18
Teen if age < 18
Do not change the case of any letter in "Adult" and "Teen" while printing the answer.
*/
class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if(age >= 18 ){
      System.out.println("Adult");
    }
    else{
      System.out.println("Teen");
    }
  }
}
