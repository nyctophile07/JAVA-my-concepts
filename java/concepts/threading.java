import  java.util.*;
class one implements Runnable{
    public void run(){
        System.out.println("my name is khan");
    }
}
class two implements Runnable{
    public void run(){
        System.out.println("raees, omm shanti om");
    }
}
class three extends Thread{
    int me=22;
    three(String name){
        super(name);
    }
    public void run(){
        System.out.println("i'm a thread of the third class");
    }
}
public class threading {
    public static void main(String args[]) {
        one obj = new one();
        two obj2 = new two();
        Scanner sc = new Scanner(System.in);
        three me = new three("suvam");
        int i = sc.nextInt();
        if (i > 5) {
            me.start();
            System.out.println("hello world, i have created a youtube channel to share my thoughts");
        }
        while (i <= 4) {
            Thread o = new Thread(obj);
            Thread x = new Thread(obj2);
            o.start();
            x.start();
            i++;
        }
        System.out.println("the state of object 'me' is "+me.getState()); // display the state of the current thread

        System.out.println("the id of the thread is "+me.getId());
        System.out.println("the name of the thread is "+me.getName());
        three neww=new three("suvu");
        System.out.println("the priority of the thread is "+neww.getPriority());
        neww.setPriority(Thread.MAX_PRIORITY);
        System.out.println("the priority of thread is "+neww.getPriority());
        neww.setPriority(2);
        System.out.println("the priority of thread is "+neww.getPriority());
    }
}
