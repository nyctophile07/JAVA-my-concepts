import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What's your name ?");
        String str=input.nextLine();
        System.out.println("enter your percentage");
        int a=input.nextInt();
        String strq=", your grade is ";
        if(a<30){
            System.out.println(str+strq+" F");
        }
        else if(a<40){
            System.out.println(str+strq+" E");
        }
        else if(a<50){
            System.out.println(str+strq+" D");
        }
        else if(a<60){
            System.out.println(str+strq+" C");
        }
        else if(a<70){
            System.out.println(str+strq+" B");
        }
        else if(a<80){
            System.out.println(str+strq+" A");
        }
        else{
            System.out.println(str+strq+" A+");
        }
    }
}
