/**
 * CountBitsFlip
 * You are given two numbers A and B. The task is to count the number of bits 
 * needed to be flipped to convert A to B.
 */
public class CountBitsFlip {
    public static int countBitsFlip(int a, int b){
        return setBit(a^b); 
    }
    
    public static int setBit(int c){
        int count = 0;
        while(c != 0){
            count++;
            c = c & (c-1);
        }
        return count;
    }
    
}