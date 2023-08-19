package Sorting;
public class Selection {
    public static void main(String[] args) {
            int ar[]={4,3,7,1,5};
            selectionSort(ar);
            printArr(ar);
        }
        public static void selectionSort(int []arr){
//        int n=arr.length;
            for (int i=0;i<arr.length-1;i++){
                int min=i;
                for (int j=i+1;j<arr.length;j++){
                    if (arr[min]<arr[j]){
                       swap(arr,min,j);
                    }
                }
                //Swapped

            }
        }
        public static void printArr(int arr[]){
            for (int i=0;i< arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
        static void swap(int arr[],int a,int b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
    }
    }


