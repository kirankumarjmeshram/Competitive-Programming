public class IsSparse {
    //Function to check if the number is sparse or not.
    public static boolean isSparseCheck(int n)
    {
       /*O(1)
        * The idea is to take bitwise AND of N with 
        right shifted version of itself, by doing this we're effectively removing the 
        trailing 1 from every sequence 
        of consecutive 1s in binary representation of N.
        */
        return ((n&(n>>1)) ==0 );  
        
        // Alternate Sol Log(N)
        // int ans =0, count = 0;
        // while(n > 0){   
        //     if((n&1) > 0){
        //         count ++;
        //     }else{
        //         count = 0;
        //     }
        //     ans = Math.max(ans, count);
        //     n = n>>1;
        // }
        // return (ans < 2);
    }
}
