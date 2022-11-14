public class CountTotalDigits {
    public static int countDigits(int n)
    { public static int countDigits(int n)
        {
            // Recursively
            if(n <10){
                return 1;
            }else{
                return 1 + countDigits(n/10);
            }
            
            // using while loop
            // int count = 0;
            // while(n>0){
            //     n = n/10;
            //     count++;
            // }
            // return count;
        }
    }
}
