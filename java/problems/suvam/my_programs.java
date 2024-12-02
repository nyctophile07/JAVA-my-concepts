package suvam;
import suvam.shapes.*;
import java.util.Objects;
import java.util.Scanner;

public class my_programs {
    static boolean lock(int c) {
        if (c == 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nENTER THE PASSWORD");
            String aa = input.nextLine();
            return Objects.equals(aa, "suvam");  /* as the return type is boolean function will check the condition and return boolean value
        like true or false according to it*/
        } else
            return true;
    }
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (lock(count)) {
            code:
            System.out.println("\n******** WELCOME TO MY JAVA PROGRAMS *******");
            System.out.println("\n enter your choice:-");
            System.out.println("1.ADDITION\n2.CHECK YOUR WEBSITE\n3.ROCK PAPER SCISSORS (GAME)\n4.LEAP YEAR OR NOT" +
                    "\n5.MULTIPLICATION\n6.PERCENTAGE ENCRYPTION\n7.FACTORIAL\n8.STRING FUNCTIONS\n9.FIBONACCI\n10." +
                    "PATTERNS\n11.TEMPERATURE CONVERSION\n12.GUESS THE MAGIC NUMBER (GAME)\n13.MAZE GAME\n14.LIBRERY MANGAGEMENT SYSTEM\n15.PRODUCT OF " +
                    "2X3 MATRIX\n16.CALCULATION OF GEOMETRICAL SHAPES\n17.CALCULATOR WITH CUSTOM EXCEPTIONS");
            String ch = input.nextLine();
            switch (ch) {
                case "1" -> ADDITION.main(args);
                case "2" -> check_a_website.main(args);
                case "3" -> RockPaperScissors.main(args);
                case "4" -> PracticalProblems.main(args);
                case "5" -> MULTIPLICATION_TABLE.main(args);
                case "6" -> percentage_encryption.main(args);
                case "7" -> factorial.main(args);
                case "8" -> string_problems.main(args);
                case "9" -> fibonacci.main(args);
                case "10" -> patterns.main(args);
                case "11" -> temp.temp();
                case "12" -> MAGIC_NUMBER.main(args);
                case "13" -> maze.main(args);
                case "14" -> OnlineLibraerySystem.main(args);
                case "15" -> matrix_product.main(args);
                case "16" -> calculate.main(args);
                case "17" -> CalculatorWithCustomExceptions.main(args);
                default -> {
                    System.out.println("please choose correct option");
                }
            }
        } else {
            System.out.println("**********PASSWORD INCORRECT********");
        }
        // System.out.println(count);
        count++;
        System.out.println("do you want to check out again\n1.YES\n2.NO");
        int per = input.nextInt();
        if (per == 1) {
            main(args);
        } else {
            System.out.println("THANK YOU FOR APPROACHING, SEE YOU LATER ");
        }
    }
    //all_problems.main(args);
}

