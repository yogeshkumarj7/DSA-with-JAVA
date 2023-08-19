package Arrays;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int ary[]={1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key you want to know");
        int inp=sc.nextInt();
        System.out.println(binaryS(ary,inp));
    }
    public static int binaryS(int  arr[],int target){
        int start=0;          //Started from 0 index
        int end=arr.length-1;
        while (start<=end){   //Loop works until this condition is true
            int mid=(start+end)/2;
            if (arr[mid]==target){
                return mid;
            }
            if(mid<target){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
}