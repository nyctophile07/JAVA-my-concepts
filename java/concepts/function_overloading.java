import java.util.Scanner;

public class function_overloading {
    static void sum(int a){
        System.out.println("the result is "+(a+10));
    }
    static void sum(int a,int b){
        System.out.println("the result is "+(a+b));
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first no.");
        int a=input.nextInt();
        System.out.println("enter the second no.");
        int b=input.nextInt();
        sum(a);
        sum(a,b);
    }
}
