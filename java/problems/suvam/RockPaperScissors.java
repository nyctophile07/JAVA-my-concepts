package suvam;

import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
      static int compscore=0;
      static int youscore=0;

    public static void main(String[] args) {
        int comp = 0;
        int you = 0;
        String str = "0";
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        //   System.out.println(n);
        System.out.println("HOW MANY ROUNDS, YOU WANT TO PLAY ?");
        int w = input.nextInt();
        int p = 1;
        while (p <= w) {
            int n = rand.nextInt(3);     // Obtain a number between [0 - 3].
            System.out.println("______ROCK PAPER SCISSORS______\n\n_____WELCOME TO THE GAME." + p + "_____");
            if (n == 0) {
                str = "SCISSORS";
            } else if (n == 1) {
                str = "ROCK";
            } else if (n == 2) {
                str = "PAPER";
            }
            System.out.println("enter your choice\n1.ROCK\n2.PAPER\n3.SCISSOR");
            int a = input.nextInt();
            String str0 = switch (a) {
                case 1 -> "ROCK";
                case 2 -> "PAPER";
                case 3 -> "SCISSORS";
                default -> "0";
            };
            System.out.print("player: ");
            System.out.println(str0);
            System.out.print("computer: ");
            System.out.println(str + "\n");
            p++;
            if (str0 == "SCISSORS" && str == "PAPER" || str0 == "PAPER" && str == "ROCK" || str0 == "ROCK" && str == "SCISSORS") {
                you++;
                System.out.println("you:comp\n  " + you + ":" + comp);
            }
            if (str0 == "SCISSORS" && str == "ROCK" || str0 == "ROCK" && str == "PAPER" || str0 == "PAPER" && str == "SCISSORS") {
                comp++;
                System.out.println("you:comp\n  " + you + ":" + comp);
            }
        }
        if (you > comp) {
            System.out.println("you have won the game " + you+":" + comp);
        }
        else if(you==comp){
            System.out.println("it's a TIE");
        }
        else {
            System.out.println("you have lost the game " + you+":" + comp);
        }
        compscore=comp;
        youscore=you;
    }
}