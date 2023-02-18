// TC : O(nA) n is the size of the coins array and A is the amount
// SC : O(A)
class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount < 1) {
            return 0;
        }
        int[] dp = new int[amount+1];
        Arrays.fill(dp, -1);
           int ans = coin(coins, amount, dp);
           if (ans== Integer.MAX_VALUE) return -1;
        else return ans; 
      
    }
    
    public int coin(int[] coins, int amount, int[] dp) {
           
            if(amount == 0) {
                return 0;
            }
            if(amount < 0) {
                return Integer.MAX_VALUE;
            }
             if(dp[amount] != -1) return dp[amount];
            int cc = Integer.MAX_VALUE;
            for(int i=0; i<coins.length; i++) {
                int coin = coin(coins, amount-coins[i], dp);
                if (coin!= Integer.MAX_VALUE){
                cc= Math.min(cc,1+coin);
            }
            }
            dp[amount] = cc;
            return cc;
    }
}
