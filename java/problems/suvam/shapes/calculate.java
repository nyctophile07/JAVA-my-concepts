package suvam.shapes;

import java.util.Scanner;

class rectangle{
    float length;
    float breadth;
    rectangle(float length, float breadth){
        this.breadth=breadth;
        this.length=length;
    }
    rectangle(){}
    float area() {
        return length*breadth;
    }
    float perimeter()
    {
        return (2f*(length + breadth));
    }
}
class square extends rectangle{
    square(float length){
        this.length=length;
        this.breadth=length;
    }
    float perimeter (){
        return 4f*length;
    }
}
class circle{
    circle(){}
    float radius;
    circle(float radius){
        this.radius=radius;
    }
    float diameter(){
        return 2f*radius;
    }
    float area(){
        return 22.7f*radius*radius;
    }
    float perimeter(){
        return 2f*22.7f*radius;
    }
}
class cylinder extends circle{
    float height;
cylinder(float radius, float height){
    this.radius=radius;
    this.height=height;
}
float volume(){
        return area()*height;
}
float lateral_area(){
    return perimeter()*height;
}

float surface_area(){
    return (lateral_area()+(2f*area()));
}
}
class sphere extends circle{
    sphere(float radius){
        this.radius=radius;
    }
    float s_area(){
        return 4f*area();
    }
    float volume(){
        return (4f/3f)*radius*area();
    }
}
public class calculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose your shape\n1.Rectangle\n2.Square\n3.Circle\n4.Cylinder\n5.Sphere");
        String ch= sc.nextLine();
        switch(ch){
            case "1"->{
                System.out.println("enter the length");
                float length=sc.nextFloat();
                System.out.println("enter the breadth");
                float breath=sc.nextFloat();
                rectangle obj=new rectangle(length, breath);
                System.out.println("Area of the rectangle: "+obj.area()+
                "\nPerimeter of the rectangle: "+obj.perimeter());
            }

            case "2"->{
                System.out.println("enter the length");
                float length=sc.nextFloat();
                square obj=new square(length);
                System.out.println("Area of the square: "+obj.area()+
                        "\nPerimeter of the square: "+obj.perimeter());
            }
            case "3"->{
                System.out.println("enter the radius");
                float radius=sc.nextFloat();
                circle obj=new circle(radius);
                System.out.println("Area: "+obj.area()+"\nDiameter: "+obj.diameter()+"\nCircumference: "+obj.perimeter());
            }
            case "4"->{
                System.out.println("enter the radius");
                float radius=sc.nextFloat();
                System.out.println("enter the height");
                float height=sc.nextFloat();
                cylinder obj=new cylinder(radius, height);
                System.out.println("Base Area: "+ obj.area() +
                        "\nLateral Area: " +obj.lateral_area()+
                        "\nArea: "+obj.surface_area() +
                        "\nVolume: "+obj.volume());
            }
            case "5"->{
                System.out.println("enter the radius");
                float radius=sc.nextFloat();
                sphere obj=new sphere(radius);
                System.out.println("Area: "+obj.s_area()+
                        "\nVolume: "+obj.volume());
            }
               default->{ System.out.println("please enter a valid choice");
                main(args);
                System.exit(0);
            }
        }
    }
}
