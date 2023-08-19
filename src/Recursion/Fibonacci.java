package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(  fibonacci(4));

    }
    public static int fibonacci(int n){
        //Base condition
        if (n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
// 0 1 1 2 3 5 8 13 21 34  55 89 144 233 377