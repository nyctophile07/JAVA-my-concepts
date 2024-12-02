package CONCEPTS.src;

import java.io.*;
import java.util.Scanner;
class method_in_java{
    static int sum(int x, int y) {    // static method, it doesn't need an object to be called
        int c = x + y;
        return c;
    }
    int div(int x, int y) {           //normal method, it needs an object to be called
        int c = x - y;
        return c;
    }
    public static void main(String args[]) {
        method_in_java obj = new method_in_java();    // object created
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first no.");
        int a = sc.nextInt();
        System.out.println("enter your second no.");
        int b = sc.nextInt();
        int c = sum(a, b);      // method invokation without object
        int d = obj.div(a, b);  // method invokation with object
        System.out.println("the sum is "+c+" and the subtraction is "+d);
    }
}
