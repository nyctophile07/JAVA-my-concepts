package suvam;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class patterns extends recursion{
    static void pattern(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void upsidedown(int x) {
        for (int i = x; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NO. OF ROWS ");
        int a = input.nextInt();
        pattern(a);
        System.out.println("THE UPSIDE DOWN BE LIKE");
        upsidedown(a);
        System.out.println("THE FIRST PATTERN USING RECURSION");
        patternRecursive(a);
        System.out.println("UPSIDEDOWN USING THE RECURSIVE FUNCTION");
        recursion obj=new recursion();
        obj.upsidedownRecursive(a);
    }
}
class recursion{
    static void patternRecursive(int x){
        if(x>=0){
            patternRecursive(x-1);
            for(int i=1;i<=x;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
     void upsidedownRecursive(int x) {
        int y = x;
        if (x == 1) {
            System.out.println("*");
        } else {
            while (y >= 1) {
                System.out.print("*");
                y--;
            }
            System.out.println();
            upsidedownRecursive(x - 1);
        }
    }

}
