package Recursion;
//Print nth fibonnacii


public class PrintNthFibonacci {
    static int nthFIbo(int n){
        if (n==0 || n==1){
            return n;
        }
        return nthFIbo(n-1)+nthFIbo(n-2);

    }
    public static void main(String[] args) {
        System.out.println(nthFIbo(50));

    }
}
