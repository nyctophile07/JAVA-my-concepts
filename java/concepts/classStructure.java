package CONCEPTS.src;

import java.util.Scanner;

class student {
    int rollno; // CLASS VARIABLE
    String name;// CLASS VARIABLE

    void show() {    // CLASS METHOD
        System.out.println("MY NAME IS " + name + " AND MY ROLLNO. IS " + rollno);
    }
    student(){        // CONSTRUCTOR
        System.out.println(" CONSTRUCTOR CALLED ");
    }
    student(int a,String name){   // CONSTRUCTOR WITH PARAMETERS
        System.out.println("MY NAME IS "+name+" AND MY ROLLNO. IS "+a);
    }
}

public class classStructure {

    public static void main(String[] args) {
        student ovj = new student(); // DEFAULT CONSTRUCTOR CALLED
        student obj = new student(); // DEFAULT CONSTRUCTOR CALLED
        ovj.rollno = 12;
        ovj.name = "SUVAM";
        obj.rollno = 22;   // object attribute
        obj.name = "SATYAM";
        ovj.show();        // object method
        obj.show();
        student con=new student(33,"SOURAV");  // CONSTRUCTOR CALLED WITH ARGUMENTS
    }
}
