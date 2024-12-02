package suvam;

import java.util.Scanner;

class square{
    static void areaAndParameterOfSquare() {
        System.out.println("******SQUARE PROBLEMS*******");
        Scanner sq=new Scanner(System.in);
        System.out.println("enter the side of the square");
        int a=sq.nextInt();
        System.out.println("THE AREA OF THE SQUARE IS "+a*a);
        System.out.println("THE PARAMETER OF THE SQUARE IS "+(a*4));
    }
}
//°F = (°C × 9/5) + 32
//C = 5/9 x (F - 32)
class temp{
    static void temp(){
        System.out.println("******TEMPERATURE CONVERSION******" +
                "\n1.Celsius to Farenhit\n2.Farenhit to Celsius");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.print("ENTER THE TEMPERATURE ");
        float temp=input.nextFloat();
        if(a==1){
            float so=(temp*9/5)+32;
            System.out.format("%f C = %f F\n",temp,so);
        }
        else {
            float so=(temp-32)*5/9;
            System.out.format("%f F = %f C\n",temp,so);
        }
    }
}
public class PracticalProblems {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        square.areaAndParameterOfSquare();
        temp.temp();
        System.out.println("Enter the year ");
        int a= input.nextInt();
        if(a%4==0){
            System.out.println("IT'S A LEAP YEAR");
        }
        else{
            System.out.println("IT'S NOT A LEAP YEAR");
        }
    }
}
