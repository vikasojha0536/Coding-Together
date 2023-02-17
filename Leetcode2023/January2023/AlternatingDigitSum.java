//Time complexity: O(length of n)
//Space complexity: O(1)

class Solution {
    public int alternateDigitSum(int n) {
        int sign = 1;
        int sum = 0;
        while(n >0) {
            int rem = n%10;
            sign = sign * -1;
            sum = sum + sign *rem;
            n = n/10;
        }
        return sign * sum;
    }
}
