package Arrays.Matrix;

public class Spiral {

    public static void printMatrix(int arr[][]){
        int n=arr.length;
        int startRow=0;
        int endRow=n-1;
        int startCol=0;
        int endCol=n-1;
        while (startRow<=endRow && startCol<=endCol){
//            Top
            for (int j=startCol;j<=endCol;j++){
                System.out.print(arr[startRow][j]+" ");
            }

//            Right
            for (int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }

//            Bottom
            for (int j=endCol-1;j>=startCol;j--){
                if (startRow==endRow){
                    break;
                }
                System.out.print(arr[endRow][j]+" ");

            }

//            left
            for (int i=endRow-1;i>=startRow+1;i--){
                if (startCol==endCol){
                    break;
                }
                System.out.print(arr[i][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {3,14,15,16}
        };
        printMatrix(matrix);
    }
}
