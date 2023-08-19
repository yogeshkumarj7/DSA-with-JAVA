package Arrays;

public class linearSearch {
    public static int linearS(int[] arr, int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4, 6, 7, 9, 10, 13, 15, 16};
        System.out.println(linearS(arr,10));
    }

}
