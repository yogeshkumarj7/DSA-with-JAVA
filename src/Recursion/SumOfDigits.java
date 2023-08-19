package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(10));
    }
   static int sumOfDigits(int n){
        if (n<=1){
            return 1;
        }
        return n%10+sumOfDigits(n/10);
    }
}
