package Recursion;

public class Printproduct {
    public static void main(String[] args) {
        System.out.println(product(123));

    }
    static int product(int n){
        if (n%10==n){
            return n;
        }
        return n%10 * product(n/10);
    }
}