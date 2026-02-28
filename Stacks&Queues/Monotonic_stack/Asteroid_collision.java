/*
You are given an integer array asteroids representing asteroids in a row. Each asteroid moves at the same speed.

The absolute value of an asteroid represents its size. The sign of an asteroid represents its direction: positive (+) means moving right, negative (-) means moving left.

Collision rules:
Asteroids moving in the same direction never collide.
When two asteroids moving in opposite directions collide, the smaller asteroid explodes and the larger asteroid continues moving in the same direction.
If both asteroids are equal in size, both explode.
Collisions are resolved one at a time, from left to right. If an asteroid survives a collision, it continues moving and may collide immediately with the next asteroid in its path.
Return the state of the asteroids after all collisions as an array in the same order.


·  2 <= asteroids.length <= 105
·  -106 <= asteroids[i] <= 106
·  asteroids[i] != 0


Input: asteroids = [1, 2, 3, -4, -2]
Output: [-4, -2]
Explanation:
Asteroid 3 and -4 collide → 3 explodes, -4 survives.
Asteroid -4 continues and collides with 2 → 2 explodes, -4 continues.
Asteroid -4 collides with 1 → 1 explodes, -4 continues.
Next asteroid -2 is moving left → no collision.
Final state: [-4, -2].
*/

class Solution{
  public int asteriod(int[] nums){
    int n = nums.length;
    List<Integer> st = new ArrayList<>();
    for(int i = 0; i < n;i++){
      if(nums[i] > 0) st.add(nums[i]);
      else{
        while(!st.isEmpty() && st.get(st.size() - 1) < Math.abs(nums[i])) st.remove(st.size() - 1);
      }
      if(!st.isEmpty() && st.get(st.size() - 1) == nums[i]) st.remove(st.size() -1);
      else if(st.isEmpty() || st.get(st.size() - 1) < 0) st.add(nums[i]);
    }
  }
  int[] result = new int[st.size()];
  for(int i = 0; i < st.size();i++){
    result[i]= st.get(i);
   }
  return result;
  }
}
