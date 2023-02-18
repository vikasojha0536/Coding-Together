// TC : O(n)
// SC : O(1)
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        ListNode first = list1;
        ListNode second = list2;
        while(first != null && second != null) {
                if(first.val <= second.val){
                  tail.next = first;
                  first = first.next;
                }
                else{
                    tail.next = second;
                    second = second.next;
                }
                tail = tail.next;
        }
        if(first != null) tail.next = first; else tail.next = second; 
        return dummy.next;
        
    }
}
