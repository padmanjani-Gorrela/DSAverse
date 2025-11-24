/*
Take the current element and keep shifting larger elements to the right until you find the correct place for it.
14,9,15,12,6,8,13
Take an element and place it in its correct place.
Check is 9 at the correct position?? No 
And you put it in where it has to be so swap
In insertion sort, we traverse from the back of the sorted portion toward the front.
That is why we use j--.
At step i, the left side of the array (from 0 to i-1) is already sorted.
Example when i = 4:
6, 9, 12, 14, 15 | 8, 13
-------------------------
 sorted part   | key

key = 8
Now, we want to find where 8 belongs (its correct position).
 So we compare from right to left:
Is 8 < 15? yes → shift 15 right

Is 8 < 14? yes → shift 14 right

Is 8 < 12? yes → shift 12 right

Is 8 < 9? yes → shift 9 right

Is 8 < 6? NO → STOP here

We reach the correct position.
This naturally requires:
j--
Because we are moving backwards in the sorted part.

[ sorted part ] key [unsorted part]


*/
class Solution {
    public int[] insertionSort(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int j = i;
            while(j > 0 && nums[j - 1] > nums[j]){
                int temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        return nums;
    }
}
