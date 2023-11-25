package Stringgg;
//Lexicographic order

//comparetoIgnore-->No diff in upppercase and lowecase
//compareTO-->Treats uppercase and lowercase differently
public class largestString {
    public static void main(String[] args) {
       String [] names={"apple","banana","chiku"};
       String largest=names[0];
       for (int i=0;i< names.length;i++){
           if (largest.compareTo(names[i])<0){
               largest=names[i];
           }

       }
        System.out.println(largest);
    }
}
//    String []fruits={"banana","mango","apple"};
//    String largest=fruits[0];
//        for (int i=1;i<fruits.length;i++){
//        if (largest.compareTo(fruits[i])<0){
//        largest=fruits[i];
//        }
//        }
//        System.out.println(largest);