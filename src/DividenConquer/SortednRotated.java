package DividenConquer;

public class SortednRotated {
    static int search(int arr[],int target,int si,int ei){
//        if (si>ei){
//            return -1;
//        }
        int mid=(si+ei)/2;
//        Fount at mid
        if (target==arr[mid]){
            return mid;

        }

//        on line 1
        if (arr[si]<=arr[mid]){
//            case a:left
            if (arr[si]<=target && target<=arr[ei]){
               return search(arr,target,si,mid-1);
            }else {
               return search(arr,target,mid+1,ei);
            }
        }
//        min on l2
        else {
            if (arr[mid]<=target && target<=arr[ei]){
                return search(arr,target,mid+1,ei);
            }else {
                return search(arr,target,si,mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        int target=0;
      int targetindex=  search(arr,target,0,arr.length-1);
        System.out.println(targetindex);

    }
}
