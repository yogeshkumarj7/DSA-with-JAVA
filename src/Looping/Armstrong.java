class Armstrong{

    public static boolean isArmstrong(int num){
    
    int originalNum=num;
     int sum=0;
     while(num>0){
        int currentNum=num%10;
        sum+=currentNum*currentNum*currentNum;
        // currentNum=0;
        num=num/10;
        }
        if(sum==originalNum){
            return true;
        }
        return false;
     }   
public static void main(String args[]){

    int num=379;
    System.out.print(isArmstrong(num));
    }
}