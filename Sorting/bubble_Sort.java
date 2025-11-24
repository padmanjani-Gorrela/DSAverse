/*

Bubble Sort:

Pushes the maximum to the last by adjacent swaps.
Check the first adjacent elements.
13,46,24,52,20,9
Check 13 and 46 and they are sorted 13<46 yes
Now again move to 46 and 24. 46 > 24 so swap.
After the one step of adjacent swapping the maximum goes to last and in the second step the second maximum goes to last.
Key ideas
Compare adjacent elements.
Swap if they are in the wrong order.
After the 1st pass → largest element reaches the end.
After 2nd pass → 2nd largest reaches second last.
Continue until sorted.
Time Complexity
Worst = O(n²)
Best = O(n) (with optimization)
Space = O(1)

for (int j = 0; j < n - i - 1; j++)  – as j starts from 0 for the first pass i.e i = 0, the j moves from 0 to n - 1 and by adjacent passing it will bring the maximum element to the last position. 
Now j starts from 0 and moves to n - 2 in the second pass – (n - i - 1) = (6 - 1- 1 = 6 - 4 = 2)
Now check the condition if(arr[j] > arr[j+1]) and then swap.
*/

class Solution{
  public int[] bubbleSort(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n - 1;i++){
      boolean swap = false;
      for(int j = 0; j < n - i - 1; j++){
        if(arr[j] > arr[j + 1]){
          int temp = arr[j];
          arr[j + 1] = arr[j];
          arr[j] = temp;
          swap = true;
        }
      }
      if(!swap) break;
    }
  return arr;
  }
}
