/*
Given a circular integer array arr, return the next greater element for every element in arr.
The next greater element for an element x is the first element greater than x that we come across while traversing the array in a clockwise manner.
If it doesn't exist, return -1 for that element.

Example 1
Input: arr = [3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9]
Output: [10, -1, 6, 6, 2, 6, 7, 7, 9, 9, 10]
Explanation:
For the first element in arr i.e, 3, the greater element which comes next to it while traversing and is closest to it is 10. Hence,10 is present on index 0 in the resultant array. Now for the second element i.e, 10, there is no greater number and hence -1 is it’s next greater element (NGE). Similarly, we got the NGEs for all other elements present in arr.  
*/

/*
HANDLING CIRCULAR ARRAYS:
One way is to double the array by pushing all the elements of array at the back in order. But this will cost an extra space for only storing elements, making it an unpreferrable method.

The preferred way to handle circular array is to use the modulus operator that will help in traversing the array in a circular manner. This will double the array hypothetically saving the extra space
*/

//Brute:
class Solution{
  
