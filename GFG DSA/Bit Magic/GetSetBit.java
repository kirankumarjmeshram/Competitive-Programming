/**
 * GetSetBit
 * https://practice.geeksforgeeks.org/batch/CP-36/track/CP-33BitMagic/problem/find-first-set-bit-1587115620
 * get position of last '1' in binary form of num from last
 * eg 12 => 1100 => here last occur of 1 position is 3
 */
public class GetSetBit {

    public static int getFirstSetBit(int n){
            
        // Your code here
        int count = 1;  
        if(n==0) return 0;
        while (n > 0){
            if((n & 1) > 0) return count;
            count ++;
            n = n >>1;
        }
        return -1;
            
    }
}