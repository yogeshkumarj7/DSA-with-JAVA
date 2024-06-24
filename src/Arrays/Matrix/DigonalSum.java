package Arrays.Matrix;

public class DigonalSum {

//    O(n^2).........
//    static void diagonalSum(int arr[][]) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (i == j) {
//                    sum += arr[i][j];
//                }else if(i+j== arr.length-1){
//                    sum+=arr[i][j];
//                }
//            }
//        }
//        System.out.println("Sum of the diagonal is " + sum);
//    }

//    O(1)
        static void diagonalSum(int arr[][]){
            int sum=0;
            for (int i=0;i< arr.length;i++){
//                PD
                sum+=arr[i][i];

//                SD
                if (i!=arr.length-1-i){
                    sum+=arr[i][arr.length-i-1];     //**********************
                }
            }
            System.out.println(sum);
        }

    public static void main(String[] args) {
        int arr1[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {0, 1, 2, 5},
                {3, 2, 1, 1}
        };
        int arr2[][] = {
                {1, 2, 3},
                {5, 6, 7},
                {0, 1, 2},
        };
        diagonalSum(arr1);
    }
}