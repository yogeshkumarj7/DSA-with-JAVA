class Print_Digits_of_num{
public static void main(String args[]){
    int num=7321;

    while(num>0){
        System.out.println(num%10);
        num/=10;
    }
}
}