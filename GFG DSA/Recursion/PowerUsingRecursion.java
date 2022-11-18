//You are given two numbers n and p. You need to find np.
public class PowerUsingRecursion {
    static int RecursivePower(int n,int p)
    {
        // add your code here
        long ans = 1;
        if(p==0){
            return 1;
        }
        if(p == 1){
            return n;
        }else{
            return n*RecursivePower(n,p-1);
        }
    }
}
