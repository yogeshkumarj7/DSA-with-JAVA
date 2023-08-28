package DividenConquer;
public class MergeSort {
    static void mergeSort(int arr[],int s,int e){
                if (s >= e) {
                    return;
                }
                int mid =  (s + e) / 2;
                mergeSort(arr, s, mid);
                mergeSort(arr, mid + 1, e);
                merge(arr, s, mid, e);
    }
    static void merge(int arr[],int start,int mid,int end){
//      Create the temporary array
        int temp[]=new int[end-start+1];
        int i=start; //iteration for the left part
        int k=0;     //iteration for the temp array
        int j=mid+1; //iteration for the right part
        while (i<=mid && j<=end ){
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
//        Compying the remaining elements
//        Left part
        while (i<=mid){
            temp[k++]=arr[i++];
        }
//        Right Part
        while (j<=end)
        {
            temp[k++]=arr[j++];
        }
        //        Compying temp to original array
        for (k=0,i=start;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0, arr.length-1);
        printArr(arr);
    }
}
