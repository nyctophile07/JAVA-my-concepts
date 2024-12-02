package suvam;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            System.out.println("enter your no.");
            int fact = input.nextInt();
            int num = fact;
            for (int a = num - 1; a >= 1; a--) {
                num = num * a;
            }
            System.out.println("the factorial of " + fact + " is " + num);

    }
}
