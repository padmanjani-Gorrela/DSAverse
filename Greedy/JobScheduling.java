/*
Given an 2D array Jobs of size Nx3, where Jobs[i][0] represents JobID , Jobs[i][1] represents Deadline , Jobs[i][2] represents Profit associated with that job. Each Job takes 1 unit of time to complete and only one job can be scheduled at a time
The profit associated with a job is earned only if it is completed by its deadline. Find the number of jobs and maximum profit.

Example 1
Input : Jobs = [ [1, 4, 20] , [2, 1, 10] , [3, 1, 40] , [4, 1, 30] ]
Output : 2 60
Explanation : Job with JobID 3 can be performed at time t=1 giving a profit of 40.
Job with JobID 1 can be performed at time t=2 giving a profit of 20.
No more jobs can be scheduled, So total Profit = 40 + 20 => 60.
Total number of jobs completed are two, JobID 1, JobID 3.
So answer is 2 60.
*/

class Job{
  int id;
  int profit;
  int deadline;
  Job(int id, int profit, int deadline){
    this.id = id;
    this.profit = profit;
    this.deadline = deadline;
  }
}

class Solution{
  public int JobSecheduling(int[][] Jobs){
    int n = Jobs.length;
    Job[] arr = new Job[n];
    for(int i = 0; i < n;i++){
      arr[i] = new Job(Jobs[i][0], Jobs[i][1], Jobs[i][2]);
    }
    Arrays.sort(arr, (a,b) -> b.profit - a.profit);
    int maxDeadline = 0;
    for(int i = 0; i < n; i++){
      maxDeadline = Math.max(maxDeadline, arr[i].deadline);
    }
    int[] slots = new int[maxDeadline + 1];
    Arrays.fill(slots, -1);
    int cnt = 0;
    int maxProfit = 0;
    for(int i = 0; i < n; i++){
      for(int j = arr[i].deadline - 1;j >= 0; j--){
        if(slots[j] == -1){
          slots[j] = arr[i].id;
          cnt++;
          maxProfit += arr[i].profit;  
          break;
        }
      }
    }
    return new int[]{cnt, maxPorfit};
  }
}


//Another variant when constraints are hard and tkaing more time use DSU
import java.util.*;

class Solution {
    
    int find(int[] parent, int x){
        if(parent[x] == x) return x;
        return parent[x] = find(parent, parent[x]); // path compression
    }
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        int[][] jobs = new int[n][2];
        for(int i = 0; i < n; i++){
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];
        }
        // sort by profit descending
        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);
        int maxDeadline = 0;
        for(int d : deadline){
            maxDeadline = Math.max(maxDeadline, d);
        }
        // DSU parent array
        int[] parent = new int[maxDeadline + 1];
        for(int i = 0; i <= maxDeadline; i++){
            parent[i] = i;
        }
        int count = 0;
        int maxProfit = 0;
        
        for(int i = 0; i < n; i++){
            int availableSlot = find(parent, jobs[i][0]);
            if(availableSlot > 0){
                count++;
                maxProfit += jobs[i][1];
                
                // mark slot as filled → union with previous slot
                parent[availableSlot] = find(parent, availableSlot - 1);
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(count);
        res.add(maxProfit);
        return res;
    }
}
