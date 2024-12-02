
import java.util.Scanner;

public class ArraysOfObjects {
    private int id;
    private String name;

    void display() {
        System.out.println("the name of the student id " + id + " is " + name);
    }

    public static void main(String[] args) {
        System.out.println("enter the no. of the students");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        ArraysOfObjects[] student = new ArraysOfObjects[count];
        for (int i = 0; i < student.length; i++) {
            System.out.println("date entry for student no." + (i + 1));
            student[i] = new ArraysOfObjects();
            System.out.println("enter the student id");
            student[i].id = sc.nextInt();
            student[i].name = sc.nextLine();
            System.out.println("enter the name of the student");
            student[i].name = sc.nextLine();
        }
        for (ArraysOfObjects p : student) {
            p.display();
        }
    }
}
