// Time complexity: O(nlogn)
// Space Complexity: O(log⁡n) , where n is the number of nodes in linked list.
// Since the problem is recursive, we need additional space to store the recursive call stack.
// The maximum depth of the recursion tree is log⁡n
class Solution {
    public ListNode sortList(ListNode head) {
        
        // base case
        if(head == null || head.next == null) {
            return head;
        }
        
        //find the middle element
        
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
        
          prev.next = null;
            ListNode first = sortList(head);
            ListNode second = sortList(slow);
            return merge(first, second);
        
        
        
    }


private ListNode merge(ListNode first, ListNode second) {
   
    ListNode dummy = new ListNode(0);
    ListNode tail = dummy;
    
   while(first != null && second != null) {
       if(first.val < second.val) {
           tail.next = first;
           first = first.next;
           tail = tail.next;
       }
       else{
           tail.next = second;
           second = second.next;
           tail = tail.next;
       }
       
   }
    if(first != null) tail.next = first;
    else
       tail.next = second;
    return dummy.next;
   }
}
    
    
