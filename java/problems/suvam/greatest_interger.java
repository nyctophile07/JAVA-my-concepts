package suvam;

import java.util.Scanner;
public class greatest_interger {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=50;
        System.out.print("enter your no. ");
        int b=input.nextInt();
        System.out.println("the given no. is a="+a+" and b="+b);
        boolean c =a<b;
        String str=" so, b is greater";
        String str11=" so, a is greater";
        String str33=c? str : str11;
        System.out.println(str33);

    }
}