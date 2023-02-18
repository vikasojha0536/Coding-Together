// TC: O(n)
// SC: O(1)
class Solution {
    ListNode prev = null;
    public ListNode reverseList(ListNode head) {
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
