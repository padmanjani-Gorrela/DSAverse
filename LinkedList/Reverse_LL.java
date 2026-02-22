// Given the head of a singly linked list. Reverse the given linked list and return the head of the modified list.

// Input: head -> 1 -> 2 -> 3 -> 4 -> 5
// Output: head -> 5 -> 4 -> 3 -> 2 -> 1
// Explanation: All the links are reversed and the head now points to the last node of the original list.



/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}

