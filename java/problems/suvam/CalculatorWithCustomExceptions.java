package suvam;

import java.util.Scanner;

class maxInputException extends Exception {
    @Override
    public String toString() {
        return "input over 100000 is not allowed";
    }
}
class maxInputForMultiplication extends Exception{
    @Override
    public String toString() {
        return "input over 10000 for multiplication not allowed";
    }
}
public class CalculatorWithCustomExceptions {
    public static void checkInput(int a) throws maxInputException {
        if (a > 100000) {
            throw new maxInputException();
        }
    }
    public static void checkMultiplicationInput(int a)throws maxInputForMultiplication{
        if (a>10000){
            throw new maxInputForMultiplication();
        }
    }
    public static <Int> void main(String args[]) {
        System.out.println("--------WELCOME TO CALCULATOR---------\nrules\n input over 100000 is not allowed\n input over 10000 for multiplication not allowed\n\nchoose your operation\n1. + \n2. - \n3. * \n4. / ");
        Scanner sc = new Scanner(System.in);
        try {
            int choice = sc.nextInt();
            System.out.println("enter the first no.");
            int num1 = sc.nextInt();
            System.out.println("enter the second no.");
            int num2 = sc.nextInt();
            try {
                checkInput(num1);
                checkInput(num2);
            } catch (Exception e) {
                System.err.println(e);
                System.exit(0);
            }
            switch (choice) {
                case 1 -> System.out.println("the result is " + (num1 + num2));
                case 2 -> System.out.println("the result is " + (num1 - num2));
                case 3 -> {
                    try{
                        checkMultiplicationInput(num1);
                        checkMultiplicationInput(num2);
                        System.out.println("the result is " + (num1 * num2));
                    }
                    catch(Exception e){
                        System.err.println(e);
                    }
                }
                case 4 -> {
                    try {
                        System.out.println("the result is " + (num1 / num2));
                    } catch (Exception e) {
                        System.err.println("CAN'T DIVIDE BY ZERO");
                    }
                }
                default -> {
                    System.err.println("please select the right operation");
                    main(args);
                    System.exit(0);
                }
            }
        } catch (Exception e) {
            System.err.println("error occured !\nInput Mismatch, try again.....");
            main(args);
            System.exit(0);
        }


    }
}
