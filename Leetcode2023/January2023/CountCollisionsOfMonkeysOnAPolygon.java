 // Time: O(log2(n)), where n is the given vertices
 // Space: O(1), in-place 
 
 class Solution {
     private int max = 1000000007;
    public int monkeyMove(int n) {
        
         return (int) (((max+ pow(n)) - 2) % max);
    }
    private long pow(int n) {
		if (n == 1)
			return 2;
		if (n % 2 == 0) {
			long half = pow(n / 2);
			return (half * half) % max;
		} else {
			long half = pow(n / 2);
			return ((half * half) % max) * 2 % max;
		}
		
	}
}
