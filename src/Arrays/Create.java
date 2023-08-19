package Arrays;

public class Create {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

//        Way--1( for each
        for (int ans : arr) {
            System.out.println(ans);
        }

//        Way--2( for loop
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }
}