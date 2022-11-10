/*
 * Given a number N and a bit number K, check if Kth 
 * bit of N is set or not. A bit is called set if it is 1.
 *  Position of set bit '1' should be indexed starting 
 * with 0 from LSB side in binary representation of the number.
 * 
*/12 => 1100 => 1*2^3+1*2^2+1*2^1+1*2^0
public class CheckBit {
    static boolean checkKthBit(int n, int k)
    {
       // with left shift operator
       int x = (1<<k) & n;
       // Your code here
       if(x > 0){
           return true;
       }else{
           return false;
       }
    //    with right shift
    // int X = (n>>K) & 1;
    // if(X == 1) {
    //     return true;
    // }else {
    //     return false;
    // }
    }
}
