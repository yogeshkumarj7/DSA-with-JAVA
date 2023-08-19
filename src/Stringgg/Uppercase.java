package Stringgg;
//Uppercase the first letter of the every word

public class Uppercase {
    public static void main(String[] args) {
        String sentence="I am yogeshkumar";
        System.out.println(upperCase(sentence));
    }
    public static String upperCase(String str){
        StringBuilder set=new StringBuilder("");
        set.append(str.charAt(0));
        for (int i=1;i<str.length();i++){
            if (str.charAt(i)==' ' && i<str.length()-1){
                set.append(str.charAt(i));
                i++;
                set.append(Character.toUpperCase(str.charAt(i)));
            }else{
                set.append(str.charAt(i));
            }
        }
        return set.toString();
    }
}
