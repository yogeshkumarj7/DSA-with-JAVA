package Stringgg;
//Lexicographic order

//comparetoIgnore-->No diff in upppercase and lowecase
//compareTO-->Treats uppercase and lowercase differently
public class largestString {
    public static void main(String[] args) {
        String []fruits={"banana","mango","apple"};
        String largest=fruits[0];
        for (int i=0;i<fruits.length;i++){
            if (largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}