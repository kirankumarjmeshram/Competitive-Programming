public class GrayToBinaryCode {
    /* 
    GrayToBinary
        n=res= 1000
        n = n>>1 =1000 >> 1 = 0100;
        res = res^n = 1000^0100 =1100;

        n =0010
        res = 1100 ^ 0010 = 1110;

        n = 0001
        res = 1110 ^0001 = 1111

        n = 0000
        res = 1111 ^ 0000 =1111
        result = 13;

    Binary to Grey
        n = 1101
        res = n ^(n>>1) 
            = 1101 ^ 0110
            = 1011
     
     */
    public static int grayToBinary(int n){
        int res = n;
        while(n>0){
            n = n >> 1;
            res = res^n;
        }
        return res;
    }
}
