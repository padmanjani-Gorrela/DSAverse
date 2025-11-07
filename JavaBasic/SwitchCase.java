/*
Given the integer day denoting the day number, print on the screen which day of the week it is. 
Week starts from Monday and for values greater than 7 or less than 1, print Invalid.
Ensure only the 1st letter of the answer is capitalised.

Input: day = 3
Output: Wednesday
*/
class Solution {
    public void whichWeekDay(int day) {
        if (day < 1 || day > 7) {
            System.out.print("Invalid");
            return;
        }
        switch (day) {
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday"); break;
            case 7: System.out.print("Sunday"); break;
        }
    }
}
