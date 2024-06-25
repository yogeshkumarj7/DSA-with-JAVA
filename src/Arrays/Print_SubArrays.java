package Arrays;

public class Print_SubArrays {

    public static void subarrays(int arr[]){
        int n=arr.length;
        for (int start=0;start<n;start++){
            for (int end=start;end<n;end++){
                for (int i=start;i<=end;i++){
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,9,10};
        subarrays(arr);

    }
}