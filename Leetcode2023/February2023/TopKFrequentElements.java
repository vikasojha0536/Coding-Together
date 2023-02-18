// TC: O(nlogn) where n is the length of the nums array
// sc: O(n+k) where n is the size of the map and priorityqueue and k is the length of res array 
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        PriorityQueue<Integer> queue =  new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        queue.addAll(map.keySet());
        int j =0;
        while(j < k){
            res[j] = queue.poll();
            j++;
        }
        return res;
        
    }
}
