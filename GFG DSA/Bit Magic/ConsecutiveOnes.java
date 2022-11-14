/*
 * Given a number N. Find the length of the longest consecutive 1s in its binary representation.
 */
public class ConsecutiveOnes {
    public static int maxConsecutiveOnes(int N) {
        
        // Your code here
        //Optimal Approach
        int count = 0;
        while(N > 0){
            N = (N & (N<<1));
            count++;
        }
        return count;
        
        //Brute Force Approch
        // int ans = 0, count =0;
        // while (N > 0){
        //     if((N&1) > 0){
        //         count++;
        //     }else{
        //         count = 0;
        //     }
        //     ans = Math.max(ans, count);
        // }
        // return ans;
    }
}
