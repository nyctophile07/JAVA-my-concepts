import java.util.Scanner;

public class try_catch {
    public static void main(String args[]) {
        int a=99;
        System.out.println("enter the value");
        Scanner obj=new Scanner(System.in);
        try{
            int b=obj.nextInt();
            int c=a/b;
            System.out.println("the value of c is "+c);
        }
        catch(Exception e){
            System.err.println("error occured");
            System.err.println(e);
        }
        System.out.println("Thank you for approaching, see you later......");
    }
}
