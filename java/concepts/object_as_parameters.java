import java.util.Scanner;

public class object_as_parameters {
    static int parameter(squuare m) {
        return 4 * m.a;
    }

    public static void main(String[] args) {
        squuare obj = new squuare();
        System.out.println("THE AREA OF THE SQUARE IS " + area.areaa(obj) + " AND THE PERIMETER IS " + parameter(obj));
    }
}

class squuare {
    Scanner sc = new Scanner(System.in);
    int a, b;

    squuare() {
        System.out.println("enter the length of the square");
        a = sc.nextInt();
    }
}

class area {
    static int areaa(squuare m) {
        m.b = m.a * m.a;
        return m.b;
    }
}