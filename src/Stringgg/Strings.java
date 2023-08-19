package Stringgg;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        char arr[] = {'y', 'o', 'g', 'i'};
//        Implementation

//        String str = "abcd";
//        String str1 = new String("Jagtap");
//        System.out.println(str);
//        System.out.println(str1);

//        String as input

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the name");
//        String name=sc.next();   // for the single word
//        System.out.println(name);
//        String name2=sc.nextLine(); //for complete line
//        System.out.println(name2);

//        CharAt
        String name="yogeshkumar";
        printChar(name);
    }
    public static void printChar(String a){
        for (int i=0;i<a.length();i++){
            System.out.print(a.charAt(i)+" ");
        }
        System.out.println();
    }
}

//Strings are immutable in java..
//Space between two word also counted as 1 unit
//Array-arr.length-->Here length is property
//String-name.length()-->Here length is function