/**
 * CountTotalSetBits
 * You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).
 */
public class CountTotalSetBits {

    /* Brute Force
     * public static int countSetBits(int n){
    
        // Your code here
        int ans = 0;
        for (int i=0;i<=n;i++) {
            ans += getCount(i);
        }
        return ans;
    }
    public static int getCount(int i) {
        int count = 0;
        while (i > 0){
            if((i &1) ==1){
                count++;
            }
            i/=2;
        }
        return count;
    }
    */

}