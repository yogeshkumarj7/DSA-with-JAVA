import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
public class Test {
    public static String reverseString(String name){
        StringBuilder ans =new StringBuilder("");
        for (int i=name.length()-1;i>=0;i--){
            ans.append(name.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str="Yogesh";
        System.out.println(reverseString(str));

    }
}
