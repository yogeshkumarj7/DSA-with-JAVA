package Sorting;

public class Bubble {
    public static void main(String[] args) {
        int ar[]={4,5,6,1,2,3,9,8,7};
        bubbleSort(ar);
        printArr(ar);
    }
    public static void bubbleSort(int []arr){
//        int n=arr.length;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]<arr[j+1]){
                   //Swapped
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//Time complexity=n2