package Recursion;

public class firstOccurence {
    static int firstOccurence(int arr[],int i,int key){
        if (i== arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return firstOccurence(arr,i+1,key);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(arr,0,5));
    }
}
