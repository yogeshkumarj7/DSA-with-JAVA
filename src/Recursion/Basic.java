package Recursion;

public class Basic {
    public static void main(String[] args) {
        recursion(1);
    }
    public static void recursion(int n){
        if (n==7){
            return;
        }
        System.out.println(n);
        recursion(n+1);
    }
}
