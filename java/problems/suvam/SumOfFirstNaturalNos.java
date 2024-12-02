package suvam;

import java.util.Scanner;

public class SumOfFirstNaturalNos {
    static int sum(int x){
        int s=0;
        for(int i=0;i<=x;i++){
            s+=i;
        }
        return s;
    }
    //USING RECURSIVE FUCTION***********
    static int summ(int x){
        if(x<=1){
            return 1;
        }
        else
            return x+sum(x-1);
    }
    public static void main(String[] args) {
        System.out.println("enter your number ");
        Scanner sc =new Scanner(System.in);
        int ab=sc.nextInt();
        System.out.println("the sum of first "+ab+"th natural numbers is "+summ(ab));
    }
}
