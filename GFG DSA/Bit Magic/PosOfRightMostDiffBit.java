/**
 * PosOfRightMostDiffBit
 * Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers
 * https://practice.geeksforgeeks.org/batch/CP-36/track/CP-33BitMagic/problem/rightmost-different-bit-1587115621
 */
public class PosOfRightMostDiffBit {
    public static int rightMostDiffBit(int m, int n)
    {
            int count = 1;
            int mask = 1;
            if(m == n) return -1;
            while((mask&m) == (mask & n)){
                mask = mask <<1;
                count++;
            }
             return count;  
    }    
}