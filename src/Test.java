import java.util.Arrays;
import java.util.LinkedList;
    public class Test {

//        Bubble sort
    public static void insertionSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

//    Insertion sort
        static void bubbleSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

//    Selection sort

        static void selectionSort(int arr[]){

        }
    public static void swap(int arr[],int a,int b){
                int temp=arr[a];
                arr[a]=arr[b];
                arr[b]=temp;

        }
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){


    int arr[]={5,1,4,2,8};
//    insertionSort(arr);
//    bubbleSort(arr);
    selectionSort(arr);
    printArr(arr);
    }
}

