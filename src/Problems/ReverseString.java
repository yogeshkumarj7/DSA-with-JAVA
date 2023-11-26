package Problems;

public class ReverseString {
    public static void reverseString(String str){
        StringBuilder ans=new StringBuilder();
        for (int i=str.length()-1;i>=0;i--){
            ans.append(str.charAt(i));
        }
        System.out.println(ans.toString());
    }
    public static void main(String args[]){
        reverseString("YOGI");
    }
}
