package CONCEPTS.src;

import java.util.Scanner;

public class enumm {
    enum day{
        monday(8);
        final int i;
        day(int i){
            this.i=i;
        }
    }
    enum season{       // A SET OF CONSTANT
        SUMMER,
        RAINY,
        WINTER,
        SPRING,
        AUTUMN,
        FALL;
        void output(){
            System.out.println("method of enum");
        }
    }
    enumm(season s){
        this.s=s;
    }
    season s;
    public static void main(String[] args)
    {
        System.out.println("there are 6 seasons in nature");
        for(season a: season.values()){
            System.out.println(a);
        }
        System.out.println("And the current season is");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        enumm obj=new enumm(season.valueOf(input));
        switch(obj.s)
        {
            case FALL -> System.out.println("so fall is so so");
            case RAINY -> System.out.println("rainy is cool");
            case AUTUMN -> System.out.println("damn");
            case WINTER -> System.out.println("jezzz cold");
        }
        season oj=season.SUMMER;
        System.out.println(oj);

        //ordinal() and values()
        season[] arr=season.values();
        for (season sss:arr) {
            System.out.println((sss.ordinal()+1)+"  "+sss);
        }

        oj.output(); // method of the enum class

        //valueOf() with ordinal(), oridinal shows the index of the constant and valueOf shows the value in that index
        System.out.println(season.valueOf("SUMMER"));
        System.out.println("the value of "+input +" is "+(season.valueOf(input).ordinal()+1));

        //initial value to constant
        for (day d:day.values()) {
            System.out.println("the value of "+d+" is "+d.i);
        }
        day daay =day.monday;// object intialized
        System.out.println("the value of"+ daay + " is "+daay.i);
    }
}
