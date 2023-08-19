package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarrays {
    public static void main(String[] args) {
//        System.out.println("Enter the elements for ur array");
//        Scanner scanner = new Scanner((System.in));
//        int elements = scanner.nextInt();
//        int arr[][]=new int[3][3];

//        Taking the input
//       for (int i=0;i<arr.length;i++){ //iterating for each row
//           for (int j=0;j<arr[i].length;j++){ //printing the elements for column
//               arr[i][j]=scanner.nextInt();
//           }
//        }

       //        Using for each
//        for (int [] a:arr
//        ) {
//            System.out.println(Arrays.toString(a));
//
//        }

//       Taking the output
//        for (int i=0;i< arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();

//        Using Arrays
//        for (int i=0;i<arr.length;i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }
        int[][]arr={
                {1,2},
                {1,2},
                {3,7}
        };

//        rowSum(arr);
        colSum(arr);

    }

//    Row wise sum

//    public static void rowSum(int[][]arr){
//        for (int i=0;i<arr.length;i++){
//            int sum=0;
//            for (int j=0;j<arr[i].length;j++){
//                sum+=arr[i][j];
//            }
//            System.out.println(sum);
//        }
//    }


//    Columnwise SUm
public static void colSum(int[][]arr){
    for (int j=0;j<arr[0].length;j++){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i][j];
        }
        System.out.println(sum);
    }
}
//    public static void colSum(int[][] arr) {
//        int numRows = arr.length;
//        int numCols = arr[0].length;
//
//        for (int j = 0; j < numCols; j++) {
//            int sum = 0;
//            for (int i = 0; i < numRows; i++) {
//                sum += arr[i][j];
//            }
//            System.out.println(sum);
//
//        }
//    }
}
