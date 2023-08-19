package Problems;
public class PrimeInRange {
    public static void main(String[] args) {
        primeInrange(15);
    }
        public static boolean isPrime(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primeInrange(int n ){
        for (int i=2;i<=n;i++){
           if( isPrime(n)){
               System.out.print(i+" ");
           }
        }
        System.out.println();
    }
}


