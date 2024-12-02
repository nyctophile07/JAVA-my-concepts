package suvam;
import java.util.Random;
import java.util.Scanner;

public class MAGIC_NUMBER {
    static int a;
    MAGIC_NUMBER(){
        Random obj=new Random();
        a=obj.nextInt(100); // obtain a number between 100
        System.out.println("*********MAGIC NUMBER GENERATED*******");
    }
    public static void main(String[] args) {
        int score=0;
     MAGIC_NUMBER number=new MAGIC_NUMBER();
       // System.out.println(a);   // THE MAGIC NUMBER
        Scanner sc=new Scanner(System.in);
        System.out.println("GUESS A NUMBER BETWEEN 1 TO 100");
        int input=sc.nextInt();
            while (a<101) {
                score++;
                if(input==a){
                    System.out.println("CONGRATULATIONS! YOU GOT THE MAGIC NUMBER ");
                    break;
                }
                else if (input < a) {
                    System.out.println(" YOUR GUESSED NUMBER IS SMALLER THAN THE MAGIC NO..");
                }
                else if (input > a) {
                    System.out.println(" YOUR GUESSED NUMBER IS LARGER THAN THE MAGIC NO..");
                }
                System.out.println("SO, GUESS AGAIN THE NUMBER");
                input = sc.nextInt();
            }
        System.out.println("\nYOU HAVE MADE "+score+" GUESSES");
    }
}
