package Stringgg;

public class Substring {
    public static String printSubstring(String str,int start,int end){
       StringBuilder s=new StringBuilder("");
       for (int i=start;i<end;i++){
           s.append(str.charAt(i));
       }
       return s.toString();
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(printSubstring(str,0,5));
    }
}
