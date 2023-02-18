// TC : O(n)
// SC : O(n)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()%2 !=0){
            return false;
        }
        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else if(stack.isEmpty()) {
                return false;
            }
            else if(ch == ')' && stack.pop() != '(') {
            return false;
            }
            else if(ch == ']' && stack.pop() != '[') {
            return false;
            }
               else if(ch == '}' && stack.pop() != '{') {
            return false;
            }
        }
        return stack.isEmpty();
 
    }
}
