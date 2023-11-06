package Problems;

public class LargestNum {
    public static void largestNum(int arr[]){
        int largest=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,0,1};
        largestNum(arr);
    }
}
