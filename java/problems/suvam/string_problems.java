package suvam;

import java.util.Scanner;
public class string_problems {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //PROBLEM 1
        System.out.println("enter your full name");
        String a=input.nextLine();
        System.out.println("your name in uppercase");
        String b=a.toUpperCase();
        System.out.println(b);

        //Problem 2
        System.out.println("\nafter replacing space with '_' ");
        String replace=a.replace(" ","_");
        System.out.println(replace);

        //Problem 3
        String letter= "Dear <name>, Thanks a lot. ";
        System.out.println("\n"+letter+ "\nafter putting your name the letter looks like ");
        System.out.println(letter.replace("<name>",b));

        //An Interesting thing about string
        System.out.println();
        String str="h";
        str+="e";
        str+="l";
        str+="l";
        str+="o";
        System.out.println(str);
    }
}
