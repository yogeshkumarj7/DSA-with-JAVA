package Stringgg;

public class stringCompression {
    public static String compress(String str){
        StringBuilder s=new StringBuilder();
        for (int i=0;i<str.length();i++){
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            s.append(str.charAt(i));
            if (count>1){
                s.append(count);
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String str="aaabccdd";
        System.out.println(compress(str));
    }
}

