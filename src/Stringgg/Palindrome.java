package Stringgg;

public class Palindrome {

    public static void main(String[] args) {
        String name="RACECA R";

        System.out.println(checkPalindrome(name));
    }
    public static boolean checkPalindrome(String name){
        name = name.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i=0;i<name.length()/2;i++){
            if (name.charAt(i)!=name.charAt(name.length()-1-i)){
//                Not a palindrome
                return false;
            }
        }
        return true;
    }
}

