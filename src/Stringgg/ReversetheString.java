package Stringgg;

public class ReversetheString {
    static String reverse(String str){
        StringBuilder ans=new StringBuilder("");
        for (int i=str.length()-1;i>=0;i--){
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str="Yogesh";
        System.out.println(reverse(str));
    }
}
