package suvam;

import java.util.Scanner;
public class ADDITION {
    public static void main(String[] args) {
       /* str a=5;
        System.out.print("ther no. is " +a);*/
        System.out.println("what's your name ?");
        Scanner input = new Scanner(System.in);
        String str= input.nextLine(); // if you want to input a whole line then the syntax will be "input.nextLine()"
        System.out.println(str+", enter your first no.");
        int a= input.nextInt();
        System.out.println(str+", enter your second no.");
        int b= input.nextInt();
        int sum= a+b;
        System.out.println("the sum of two no. is " +sum);
        //System.out.println("do you want some experiments ?");
    }
}
