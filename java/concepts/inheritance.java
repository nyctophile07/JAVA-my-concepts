package CONCEPTS.src;

public class inheritance {
    public static void main(String[] args) {
        //derived sc=new derived(5,454);
        child ne = new child(3, 5, 2);
    }
}
    class base{
        base(){
            System.out.println("constructor of base class");
        }
        base(int x){
            System.out.println("this is the second constructor in base class "+x);
        }
    }
    class derived extends base {
        derived(){
            System.out.println("default ");
        }
        derived(int x,int y){
            super (x);
            System.out.println("constructor of derived class "+y);
        }
    }
    class child extends derived {
        child(int x,int y, int z){
            super(x,y);
            System.out.println("the no. is z "+z);
        }
    }

