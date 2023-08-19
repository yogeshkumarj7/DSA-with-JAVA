package Stringgg;

public class Substring {
    public static String printSubstring(String str,int start,int end){
        String sub="";
        for (int i=0;i<end;i++){
            sub+=str.charAt(i);
        }
        return sub;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(printSubstring(str,0,5));
    }
}
