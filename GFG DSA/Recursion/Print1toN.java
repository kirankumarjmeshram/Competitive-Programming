public class Print1toN {
    public void printNos(int N)
    {
       if(N==1){
           System.out.print(1);
           System.out.print(" ");
       }else{
           printNos(N-1);
           System.out.print(N);
           System.out.print(" ");
       }
    }
}
