/*
Given an array arr of size n containing elements, find the next greater element for each element in the array in the order of their appearance.
The next greater element of an element in the array is the nearest element on the right that is greater than the current element.
If there does not exist a next greater element for the current element, then the next greater element for that element is -1.

Example 1
Input: arr = [1, 3, 2, 4]
Output: [3, 4, 4, -1]
Explanation: In the array, the next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4 is -1, since it does not exist.
*/

/*
WHAT IS MONOTONIC STACK??
THE MOMENT WE START STORING THE ELEMENTS IN SPECIFIC ORDER THAT IS WHEN WE CALL IT AS A MONOTONIC STACK
WE CAN STORE IN INCREASING OR DECREASING ORDER.
*/

/*
A naive approach to solve this question will be to use a loop to pick up an element of the array, and then find its next greater element using a nested loop. In case there is no larger element found on the right of the current element, the next greater element will be set to -1.*/

class Solution{
  public int[] nge(int[] arr){
    int n = arr.length;
    int[] ge = new int[n];
    for(int i = 0; i < n; i++){
      for(int j = i + 1; j < n;j++){
        if(a[j] > a[i]){
          ng[i] = a[j];
          break;
        }
      }
    }
    return ge;
  }
}

/*

*/
          
