package Recursion;

public class XpowerofN {
//    OPTIMISED O(n.logn)
    public static int optimisedPower(int a,int n){
//        BAse Case
        if (n==1){
            return a;
        }
        int halfPower=optimisedPower(a,n/2)*optimisedPower(a,n/2);
        if (n%2!=0){
            halfPower=a*halfPower;
        }
        return halfPower;
    }

//    O(logn)
//    public static int intpower(int x,int n){
////        Base case for the problem
//        if (n==1){
//            return x;
//        }
//        return x*intpower(x,n-1);
//    }
    public static void main(String[] args) {
//        System.out.println(intpower(2,3));
        System.out.println(optimisedPower(2,3));


    }
}
