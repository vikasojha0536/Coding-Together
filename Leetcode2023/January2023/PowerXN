 // Time: O(log2(n)), where n is the given power
 // Space: O(1), in-place 
 public class Solution {
        public double myPow(double x, int m) {
           if(m <0) {
               return 1/pow(x, -m);
           }
           else{
             return pow(x, m);   
           }
          
    }

       public double pow(double x, int m) {
            double temp=x;
            if(m==0)
            return 1;
            temp=pow(x,m/2);
            if(m%2==0)
            return temp*temp;
            else 
            {
                return x*temp*temp;
    }
 }
 }
