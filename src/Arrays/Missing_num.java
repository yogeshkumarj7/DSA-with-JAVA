class Missing_num{

    public static int miss_num(int arr[]){
        int n=arr.length+1;
        int cSum=0;
        int sum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            cSum+=arr[i];
        }

        return sum-cSum;
    }
public static void main(String args[]){
    int arr[]={1,2,3,4,5,7,8};
    int ans=miss_num(arr);
    System.out.print(ans);
}
}