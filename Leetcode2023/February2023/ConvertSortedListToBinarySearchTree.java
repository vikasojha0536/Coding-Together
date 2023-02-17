// Time complexity O(nlogn) where n is the size of the linked list
// space complexity: O(logn) for recursive stack
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        
        if(head == null ) {
            return null;
        }
           if(head.next == null ) {
            return new TreeNode(head.val);
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next;
            slow = slow.next;
            if(fast != null) {
               fast = fast.next; 
            }        
        }
        if(prev != null)
        prev.next = null;
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }
}
