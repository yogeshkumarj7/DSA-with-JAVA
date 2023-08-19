package Recursion;

public class SkipApple {
    public static void main(String[] args) {
        System.out.println(apple("isappleempty"));

    }
   static String apple(String inp){
        if (inp.isEmpty()){
            return "";
        }
        char ch=inp.charAt(0);
        if (inp.startsWith("apple")){
            return apple(inp.substring(5));

        }else {
            return ch+apple(inp.substring(1));
        }

    }
}