package Stack;
import java.util.Stack;
public class reverseString {
    public static String reverseString(String str){
        Stack<Character>s=new Stack<>();
        for (int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        StringBuilder result=new StringBuilder("");
        while (!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str="Yogesh";
        System.out.println(reverseString(str));
    }
}
