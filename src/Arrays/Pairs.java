package Arrays;

public class Pairs {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        pairs(arr);

    }
    public static void pairs(int arr[]){
       int pairs=0;
       for (int i=0;i<arr.length;i++){
           for (int j=0;j<arr.length;j++){
               System.out.print("("+arr[i]+","+arr[j]+")");
               pairs++;
           }
           System.out.println();
       }
        System.out.print(pairs);
    }
}


