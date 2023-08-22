package Recursion;

public class DecreasingOrder {
    static void decreasingOrder(int n) {
        if (n==0){
            return;
        }
        System.out.print(n+" ");

        decreasingOrder(n-1);
    }
    public static void main(String[] args) {

        decreasingOrder(10);
    }
    }
