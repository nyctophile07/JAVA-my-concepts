package suvam;

import java.util.Scanner;
public class all_problems {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        //problem 1
        int n=5;
       for (int a=n;a>=1;a--) {
           for (int j = 1; j <= a; j++) {
               System.out.print("*");
           }
           System.out.print("\n");
       }*/
        //problem 2
        /*int sum=0;
       int a=1;
       while(a<=10){
           sum=sum+(2*a);
           a++;
       }
        System.out.println("the sum of first 10 even no. is "+sum); */

        System.out.println("Enter your choice\n1.FACTORIAL\n2.MULTIPLICATION");
        int ch=input.nextInt();
        switch(ch){
            case 1:{
            System.out.println("enter your no.");
            int fact = input.nextInt();
            int num = fact;
            for (int a = num - 1; a >= 1; a--) {
                num = num * a;
            }
            System.out.print("the factorial of " + fact + " is " + num);
        }
        break;
            case 2:{
                System.out.print("MULTIPLICATION TABLE OF ");
                int n=input.nextInt();
                for (int a = 1; a <= 10; a++)
                {
                    System.out.println(n+" X "+a+" = "+(n*a));
                }
            }
            break;
            default:
                System.out.println("please choose correct option");
                main(args);
                break;
    }
}}
