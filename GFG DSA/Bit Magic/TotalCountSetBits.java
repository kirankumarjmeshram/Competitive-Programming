/*
 * Given a number N. Find the total count of 
 * set bits for all numbers from 1 to N(both inclusive).
*/

public class TotalCountSetBits {
    public static int countSetBits(int n){
        n+=1;
        int count=0;
        
        for( int x=2 ; x/2<n ; x=x*2 )
        {
            int quotient = n/x;
            count += quotient * x / 2;
            
            int remainder = n%x;
            if(remainder > x/2)
                count += remainder - x/2;
        }
        
        return count;
    }
}
