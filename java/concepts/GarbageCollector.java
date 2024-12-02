import java.util.Scanner;

class employee {
    Scanner sc = new Scanner(System.in);
    String name;
    int salary = 3000;

    void setName() {
        //System.gc(); .........GARBAGE COLLECTOR
        System.out.println("enter your employee's name ");
        name = sc.nextLine();
    }

    void getname() {
        System.out.println("THE SALARY OF " + name + " is " + salary);
    }
}

public class GarbageCollector {
    //problem.1/ FIND OUT THE AVG OF GIVEN NO.
    static float avg(float... arr) {
        float sum = 0;
        for (float i : arr) {
            sum += i;
        }
        float avg = sum / arr.length;
        return avg;
    }
    //problem.2/ CREATE A CLASS WITH SOME FOLLOWING PROPERTIES

    public static void main(String[] args) {
        System.out.println("problem.1/ FIND OUT THE AVG OF GIVEN NO.");
        System.out.println("the avg of the given numbers is " + avg(1, 2, 3, 4));
        System.out.println("\nproblem.2/ CREATE A CLASS WITH SOME FOLLOWING PROPERTIES");
        employee shyam = new employee();
        shyam.setName();
        shyam.getname();
    }
}