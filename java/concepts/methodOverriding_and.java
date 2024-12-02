package CONCEPTS.src;
class a{
    void me(){
        System.out.println("method of a");
    }
}
class b extends a{
    @Override              // notation of overriding, if overriding not occurs then it will be show error
    void me(){          // overriding
        System.out.println("method of b");
    }
    void me(int a){      // overloading
        System.out.println("method of b, "+a);
    }
}
public class methodOverriding_and {
    public static void main(String[] args) {
        b arc=new b();
        arc.me();
        arc.me(3);
    }
}
