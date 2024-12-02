package suvam;

import java.util.Scanner;

public class fibonacci {
    static int fib(int n)
    {
        if (n<=2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no.");
        int n= sc.nextInt();
        System.out.println("the fibbonacci series upto your no. is");
        for (int i=1;i<=n;i++){
            System.out.print(fib(i)+"\t");
        }
        System.out.println("\nthe "+n+"th no. of the fibbonacci series is "+fib(n));
    }
}
