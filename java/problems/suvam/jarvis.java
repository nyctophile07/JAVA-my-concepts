package suvam;

import java.util.Random;
import java.util.Scanner;

public class jarvis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Random obj=new Random();
        String hello="Hi, how may i help you ?";
        String hello1="Hello, how are you ?";
        String who="This is a chat-bot model named J.A.R.V.I.S designed to assist you with your daily routine.";
        String who1="I'm J.A.R.V.I.S, a Chat-bot model programmed to help you with your queries.";

        System.out.println("press [ENTER] to start the conversation");
        sc.nextLine();
        String input="start";
        System.out.println("What's your name ?");
        String name=sc.nextLine();
        System.out.println(hello);

        while(!input.equals("exit")){
            int random=obj.nextInt(2);
            input=sc.nextLine();
            input=input.toLowerCase();
            System.out.print("█ ");
            if(input.contains("hello") || input.contains("hi") || input.contains("hey"))
            {
                System.out.println(random==0?hello:hello1);
            }
            else if(input.contains("my name")){
                System.out.println("Your name is "+name);
            }
            else if(input.contains("who")||input.contains("introduce") || input.contains("name")){
                System.out.println(random==0?who:who1);
            }
            else if(input.contains("game")){
                System.out.println("ok !");
                games.main(args);
                if(RockPaperScissors.compscore>RockPaperScissors.youscore){
                    System.out.println("ha ha! nice try but i won...");
                }
            }
            else if(input.contains("my programs")){
                System.out.println("here are your all programs....");
                my_programs.main(args);
            }
            else if(input.contains("books")){
                OnlineLibraerySystem.main(args);
            }
            else{
                System.out.println("Sorry! something went wrong");
            }
        }
    }
}
