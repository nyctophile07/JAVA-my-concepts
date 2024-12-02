import java.util.Scanner;

class invalidAgeDetected extends Exception{
    @Override
    public String toString() {
        return "You are not eligible";
    }
}
public class CustomException {
    public static void checkAge(int a) throws invalidAgeDetected {
        if(a<18){
            throw new invalidAgeDetected();
        }
        else{
            System.out.println("you are eligible");
        }
    }
    public static <Int> void main(String args[]) {
        System.out.println("enter your age to check if are eligible for voting");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try{
            checkAge(age);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
