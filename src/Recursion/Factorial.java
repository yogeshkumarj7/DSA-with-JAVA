package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

//        System.out.println(factorial(sc.nextInt(y)));

        System.out.println(sum(10));



    }
//FAcorial

//    public static int factorial(int y){
//        if (y<=1){
//            return 1;
//        }
//        return y*factorial(y-1);
//    }

//    Sum of n numbers
    public static int sum(int n){
        if (n<=1){
            return 1;
        }

        return n+sum(n-1);
    }
}
