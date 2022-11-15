/*
 * Gray code is also known as Reflected Binary Code (RBC)
 * We call it Gaey Code after Frank Gray
 * Unweighted code 
 * also called as Unit distance code / Minimum error code / cyclic code
 * Gray Code is binary numeral system where two succesive values differ in only one bit
 * and because of these binary number is converted to gray code to reduce switching operations
 * 
 * 
 */
public class BinaryToGreyCode {
    public static int greyConverter(int n) {
        
        // Your code here
        if(n == 0){
            return 0;
        }else{
            return (n ^ (n >> 1));
            //let n = 100110; n>>1 = 10011;
            // 100110
            //^ 10011
            // 110101 = n^(n>>1)
        }
        
    }
}
