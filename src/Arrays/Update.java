package Arrays;

public class Update {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        update(arr);
        for (int updated:arr){
            System.out.println(updated);
        }
    }
    public static void update(int arry []){
        for (int i=0;i<arry.length;i++){
            arry[i]=arry[i]+1;
        }
    }
}
