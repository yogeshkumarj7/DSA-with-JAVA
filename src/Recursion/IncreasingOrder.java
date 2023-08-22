package Recursion;

public class IncreasingOrder {
    static void increasingOrder(int n) {
//  base case
        if (n == 1) {
            System.out.println(n);
            return;
        }
        increasingOrder(n - 1);
        System.out.println(n);

    }

    public static void main(String args[]) {
        increasingOrder(10);
    }
}
