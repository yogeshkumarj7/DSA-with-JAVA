package Arrays;
public class largestNumber {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,27,8,9,15};
        System.out.println(largestElement(arr));
    }
    public static int largestElement(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
}