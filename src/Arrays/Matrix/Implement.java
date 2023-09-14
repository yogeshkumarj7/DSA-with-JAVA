package Arrays.Matrix;

import java.util.Scanner;
//matrix.length-->Length of the rows
//matrix[i].length-->length of corresponding row
public class Implement{

//    Found cell
    public static boolean isPresent(int arr[][],int key){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if (key==arr[i][j]){
                    System.out.println("Cell found at "+"("+i+" , "+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][2];

//        Input
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

//        Output
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        isPresent(matrix,10);
    }
}
