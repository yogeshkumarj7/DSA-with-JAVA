package Recursion;

public class isArraySorted {
    public static boolean isArraySorted(int arr[],int i){

      if (i == arr.length-1){
          return true;
      }
      if (arr[i]>arr[i+1]){
          return false;
      }
      return isArraySorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(isArraySorted(arr,0));
    }
}
