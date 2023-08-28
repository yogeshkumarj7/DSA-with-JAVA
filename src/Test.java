public class Test {
    //Subarray
//    Use the 3loops
//    1 for start | 1 for end and last for printing it and deciding the stream of the subarray
    static int subArray(int arr[]){

        int ln=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>ln){
                ln=arr[i];
            }
        }
        return ln;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3,17};
        System.out.println(subArray(arr));


    }
}
