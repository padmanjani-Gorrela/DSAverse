/*
As the name recommends we select minimums 
In array 13,46,24,52,20,9
9 is the minimum
And place the 9 in first place and now where will the 13 stay? 13 goes to 9 place i.e swap
SELECT THE MINIMUMS AND SWAP.
After places 9 at the first, the remaining array is not sorted so now select the minimum from that array and place.
9,46,24,52,20,13.
Now the minimum among the rest is 13 so move 13 to the next smallest place and swap the element.
9,13,24,52,20,46.
Now the smallest among the rest of the array is 20 so move to the next smallest place and swap.
9,13,20,| 52,24,46.
Select the smallest among the rest.
9,13,20,24,|52,46.
Select the smallest among the rest of the array
9,13,20,24,46,52.
And hence it is sorted.
i = 0 → select min = 9 → swap with arr[0]
9,46,24,52,20,13

i = 1 → select min = 13 → swap with arr[1]
9,13,24,52,20,46

i = 2 → select min = 20 → swap with arr[2]
9,13,20,52,24,46

i = 3 → select min = 24 → swap with arr[3]
9,13,20,24,52,46

i = 4 → select min = 46 → swap with arr[4]
9,13,20,24,46,52

First time swap happened and minimum index and index0 and next time (0 to n-1)
The swap happened at index 1 and the minimum index(1 to n - 1)
The swap happened at index 2 and the minimum index.(2 to n - 1)
Swapping happened till n- 2
Outer loop:
Runs from i = 0 to i = n-2
 (because last element is automatically sorted)
Inner loop:
Runs from j = i+1 to n-1
 Search for the smallest element in the remaining array.
So yes, 13 will be mini initially for the first pass.
*/

import java.util.*;
public class Selection{
  public int[] selectionSort(int[] arr){
    for(int i = 0; i < n - 1; i++){
      int mini = i;
      for(int j = i + 1; j < n; j++){
        if(arr[j] < arr[mini]){
          mini = j;
        }
      }
      if(mini != i){
        int temp = arr[i];
        arr[i] = arr[mini];
        arr[mini] = temp;
      }
    }
  return arr;
  }
}
