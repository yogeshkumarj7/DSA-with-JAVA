package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={7,5,3,9,6,1,2,4,8};
        reverseArray(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseArray(int arr[]){
      int start=0;
      int end=arr.length-1;
      while (start<end){
          int temp=arr[end];
          arr[end]= arr[start];
          arr[start]=temp;
          start++;
          end--;
      }
    }
}
