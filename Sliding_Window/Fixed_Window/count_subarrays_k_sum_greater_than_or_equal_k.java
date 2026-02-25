/*
Given array arr[], integer K, and integer X,
Count subarrays of size exactly K whose sum ≥ X.

arr = [2,1,5,1,3,2]
K = 3
X = 7

*/

/*
Approach:
Instead of recalculating sum every time:
Compute sum of first window of size K
Slide window:
Remove arr[i-K]
Add arr[i]
Check if sum ≥ X
*/

class Main {
    public static int countSubarrays(int[] arr, int k, int x) {
        int n = arr.length;
        if (n < k) return 0; //edge case what if array size is less than winodw size?
        int cnt = 0;
        int sum = 0
        // First window
        for (int r = 0; r < k; r++) {
            sum += arr[r];
        }
        if (sum >= x) cnt++;
        // Remaining windows
        for (int r = k; r < n; r++) {
            sum += arr[r];
            sum -= arr[r - k];

            if (sum >= x) cnt++;
        }
        return cnt;
    }
}

/*
arr = [2,1,5,1,3,2]
k = 3
x = 7
Windows:
[2,1,5] = 8 ✔
[1,5,1] = 7 ✔
[5,1,3] = 9 ✔
[1,3,2] = 6 x

Answer = 3
*/


/*
Complexity
Time: O(N)
Space: O(1)
*/
