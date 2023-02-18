// TC: O(n)
// SC: O(n) + O(n) for map and res list
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(int i=0; i<strs.length; i++) {
           char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String ordered = new String(chars);
            if(!map.containsKey(ordered)) {
               map.put(ordered, new ArrayList<>());
            }
            map.get(ordered).add(strs[i]);
            
        }
        for(List<String> list: map.values()){
            res.add(list);
        }
        return res;
        
    }
}
