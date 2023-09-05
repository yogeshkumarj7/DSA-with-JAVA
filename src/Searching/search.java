package Searching;

public class search {

//    Linear Search
    public static int linearSearch(int arr[],int target){
        for (int i=0;i< arr.length;i++){
            if (target==arr[i]){
                return i;
            }
        }
        return -1;
    }

//    Binary search
    public static int binarysearch(int arr[],int target){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;

//        mid
            if (target==arr[mid]){
                return mid;
            }
//        left
            if (target<mid){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8};
//        System.out.println(linearSearch(arr,2));
        System.out.println(binarysearch(arr,6));
    }
}
