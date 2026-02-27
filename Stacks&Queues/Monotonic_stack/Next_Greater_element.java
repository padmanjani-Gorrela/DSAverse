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
In order to obtain the next greater element (which will always be on the right side) for a particular element, if we traverse the array from the beginning to the end, it is impossible to know the right elements beforehand as they will be unvisited. But if the traversal is done from the end to the beginning of array, it will be easier to find the next greater element cause all the right elements will be already visited(known) to us. Thus, we will start the traversal from back and the whole discussion will be based on the same.
Now since, we are traversing from the back, the question is now to find the last greatest element. Hence, no matter how many greater elements we encounter, the only greater element we must consider first is the last greater element that was seen. This gives an idea of using stack data structure because it stores elements in the Last In First Out fashion. Now, comes the question of how to store the elements in the stack?
*/


class Solution{
  public int[] nextGreater(int[] arr){
    int n = arr.length;
    int[] nge = new int[n];
    Stack<Integer> st = new Stack<>();
    for(int i = n - 1; i >= 0; i--){
      while(!st.isEmpty() && st.top <= arr[i]){
        st.pop();
      }
      if(st.isEmpty()) nge[i] = -1;
      else nge[i] = st.top();
      st.push(arr[i]);
    }
    return nge;
  }
}


// Time Complexity: O(N) (where N is the size of the array)
// Space Complexity: O(N)
      
     
