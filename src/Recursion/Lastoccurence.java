package Recursion;
//First look forward then compare with itself
public class Lastoccurence {
    static int lastOccurence(int arr[],int key,int i){
//        element not found
        if (i==arr.length){
            return -1;
        }
        int isfound=lastOccurence(arr,key,i+1);
        if (isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,9,8,4,9,7};
        System.out.println(lastOccurence(arr,4,0));
    }
}
