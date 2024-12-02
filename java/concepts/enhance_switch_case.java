package CONCEPTS.src;
import java.util.Scanner;
public class enhance_switch_case {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your first no.");
        int a=input.nextInt();
        System.out.println("enter your second no.");
        int b=input.nextInt();
        System.out.println("enter the operation you want to perform \n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION");
        int c=input.nextInt();
        /*
        switch(c)
        {
            case 1:
                System.out.println("your result is "+ (a+b));
                break;
            case 2:
                System.out.println("your result is "+ (a-b));
                break;
            case 3:
                System.out.println("your result is "+ (a*b));
                break;
            case 4:
                System.out.println("your result is "+ (a/b));
                break;
            default:
                System.out.println("please choose your option correctly");
                break;
        }
        */
        switch (c) {
            case 1 -> System.out.println("your result is " + (a + b));
            case 2 -> System.out.println("your result is " + (a - b));
            case 3 -> System.out.println("your result is " + (a * b));
            case 4 -> System.out.println("your result is " + (a / b));
            default -> System.out.println("please choose your option correctly");
        }
        // in enhanced switch we just make the switch block short with a "->" and replacing the break
    }
}
