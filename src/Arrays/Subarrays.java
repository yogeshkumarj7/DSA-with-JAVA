package Arrays;

public class Subarrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        subarray(arr);
    }
    public static void subarray(int arr[]){
        for (int i=0;i<arr.length;i++){  //decided start
            int start=i;
            for (int j=i;j<arr.length;j++){  //decided end
                int end=j;
                for (int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
