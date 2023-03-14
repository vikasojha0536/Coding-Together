// TC : O(n) where n is the size of the linked list
// SC: O(1) no auxiliary space
public class Solution {
    public ListNode detectCycle(ListNode head) {
         ListNode slow = head;
        ListNode fast = head;
        ListNode start = head;
        // O(n) 
        // O(1)
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                while(start != slow) {
                    start = start.next;
                    slow = slow.next;
                }
                return start;
            }
        }
        return null;
    }
}
