package Problems;public class PrimeNo {
    public static void main(String[] args) {

//        System.out.println(isPrime(57));

        System.out.println(isPrime(30235687));
    }

//    public static boolean isPrime(int n) {
//        for (int i = 2; i <= n - 1; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
    public static boolean isPrime(int n){
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}