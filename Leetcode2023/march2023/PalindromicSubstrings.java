// TC O(n2) where n is the length of the string
//SC O(1)
class Solution {
    public int countSubstrings(String s) {
        if(s.length() < 2) {
            return 1;
        }
        int count =0;
        for(int i =0; i<s.length(); i++) {
               count = count + expandAroundCenter(s, i, i);
              count = count + expandAroundCenter(s, i, i+1); 
        }
        return count;
    }

    int expandAroundCenter(String s, int i, int j) { 
        int count =0;
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            count++;
            i--;
            j++;
        }
    return count;
    }
}
