package Arrays;

public class Max_subarray {
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        maxSubarray(arr);
    }

    public static void maxSubarray(int arr[]) {
        int cs=0;
        int ms=0;
        for (int i=0;i<arr.length;i++){
            cs+=arr[i];
            if (cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println(ms);
    }
}

//Kadanes algorithm used here
//if the current sum is less than 0, make it 0.
//everytime check MATH.max for current sum and maximum sum..
