// TC: O(nklogk) where n is the average size of the linked list and k is the size of the priorityqueue(length of listNode array)
// Sc: O(k) size of meanheap(PQ)
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
         if (lists==null || lists.length==0) return null;
        int n = lists.length;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(n, (a,b) -> a.val - b.val);
        for(ListNode l: lists) {
            if(l != null){
                pq.add(l);
            }
        }
        
        while(!pq.isEmpty()) 
        {
            tail.next = pq.poll();
            tail = tail.next;
            if(tail.next != null) {
                pq.add(tail.next);
            }
        }
        return dummy.next;
    }
}
