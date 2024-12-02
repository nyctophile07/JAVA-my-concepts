package suvam;

import java.util.Scanner;
public class MULTIPLICATION_TABLE {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("MULTIPLICATION TABLE OF ");
        int n=input.nextInt();
        for (int a = 1; a <= 10; a++)
        {
            System.out.println(n+" X "+a+" = "+(n*a)); // or // System.out.format("%d X %d = %d\n",n,a,n*a);
        }
    }
}
