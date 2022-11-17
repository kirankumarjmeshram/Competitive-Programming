/*
 * Given a non-negative integer N. The task is to check if N is a power of 2. 
 * More formally, check if N can be expressed as 2x for some x.
 */
public class IsPowerOfTwo {
    public static boolean isPowerofTwo(long n){
        // Your code here
        /*
         * First, check if n==0 return false otherwise
            Take the Bitwise and between n and n-1;
            If Bitwise and value is zero then return true.
            Else return false.
         */
        return  (n !=0)&&((n & (n-1)) == 0);
        /*or we can write above 
         * if(n==0) return false;
         * if(n!=0) return (n&(n-1)==0);
         */
        
    }
}
