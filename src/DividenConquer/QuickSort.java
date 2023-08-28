package DividenConquer;

public class QuickSort {
    static void quickSort(int arr[],int s,int e){
//        Base case
//        Pivot-last element
        int pindex=partition(arr,s,e);
        partition(arr,s,pindex-1); //left
        partition(arr,pindex+1,e);

    }
    static int partition(int arr[],int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for (int j=start;j<end;j++){
        if (arr[j]<=pivot){
            i++;
//            swap
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        }
        i++;
        int temp=pivot;
        arr[end]=arr[i];
        arr[i]=temp;
        return i;
    }
    static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quickSort(arr,0, arr.length-1);
        printArr(arr);
    }
}
