package CONCEPTS.src;
import java.util.Scanner;

public class AGGREGATION {
    Scanner sc=new Scanner(System.in);
    int id;
    String name;
    Address add;         // AGGREGATION, 

    AGGREGATION(int id,String name,Address add){
        this.id=id;
        this.name=name;
        this.add=add;
    }
    void display(){
        System.out.println("the information of the AGGREGATION is below there ");
        System.out.println("ID: "+id);
        System.out.println("NAME: "+name);
        System.out.println("city: "+add.city);
        System.out.println("pincode: "+add.pincode);
        System.out.println("country: "+add.country);

    }
    public static void main(String[] args) {
        Address add=new Address(751003,"BHUVANESWAR","INDIA");
        AGGREGATION AG=new AGGREGATION(25,"SUVAM CHOUDHURY",add);
        AG.display();
    }
}
class Address{
    int pincode;
    String city;
    String country;
    Address(int pincode,String city,String country){
        this.pincode=pincode;
        this.city=city;
        this.country=country;
    }
}