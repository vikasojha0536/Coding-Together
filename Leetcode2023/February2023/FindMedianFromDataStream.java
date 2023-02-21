// TC: O(logn) for addNum method and O(1) for findMedian
// SC O(1) for priority queues
class MedianFinder {
    
    private PriorityQueue<Integer> maxHeap = null;
    private PriorityQueue<Integer> minHeap = null;
    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a,b) -> b-a);
        minHeap = new PriorityQueue<>((a,b) -> a-b);
    }
    public void addNum(int num) {
        if(maxHeap.size() == 0 || maxHeap.peek() > num) {
            maxHeap.offer(num);
        }
        else{
            minHeap.offer(num);
        }
        balance();
    }
    public double findMedian() {
      if(maxHeap.size() > minHeap.size()) {
          return maxHeap.peek();
      }
      else if(minHeap.size() > maxHeap.size()) {
          return minHeap.peek();
      }
        else{
            return (maxHeap.peek() + minHeap.peek())/2.0;
        }
       
    }
    
    void balance() {
      if(minHeap.size() - maxHeap.size() > 1) {
          maxHeap.offer(minHeap.poll());
      }  
      if(maxHeap.size() - minHeap.size() > 1) {
          minHeap.offer(maxHeap.poll());
      }  
    }
}


