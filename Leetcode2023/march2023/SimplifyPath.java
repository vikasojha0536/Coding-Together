// SC O(n) where n is path length
// TC O(n) where n is path length
class Solution {
    public String simplifyPath(String path) {
        Deque<String> d = new LinkedList<>(); // O(n)
        StringBuilder res = new StringBuilder(); //O(n)
        for(String s: path.split("/")) {
            if(s.equals("..")) {
            if(!d.isEmpty()) {
               d.pop();
            }
            }
            else if(s.equals(".")  || s.equals("")){
                continue;
            }
            else {
               d.push(s);
            }
        }
        if(d.isEmpty()) return "/";
        while(!d.isEmpty()) {
            res.append("/");
            res.append(d.removeLast());
            
        }
        return res.toString();
    }
}
