/*
 * You are given a number n. You need to find nth Fibonacci number.
F(n)=F(n-1)+F(n-2); where F(1)=1 and F(2)=1
 */

public class FibonacciNumber {
    static int fibonacci(int n)
    {
        // your code here
        if(n==1){
            return 1;
        }if(n == 2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
