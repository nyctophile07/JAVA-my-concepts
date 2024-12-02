package suvam;

import java.util.Objects;
import java.util.Scanner;
public class percentage_encryption
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("HELLO, WELCOME TO THE JAVA");
        int a=60;
        System.out.println("what's your relation with me ?");
        System.out.println("family or friend");
        String str= input.nextLine();
        if (Objects.equals(str, "friend")) {
            System.out.println("my percentage is " + a + "%");
        } else {
            System.out.println("my percentage is " + (a+30) + "%");
        }
    }
}