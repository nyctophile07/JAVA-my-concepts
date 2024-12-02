import java.io.*;
import java.util.*;
public class fileHandling {
    public static void main(String[] args) throws IOException {
        FileWriter input=new FileWriter("E:\\coding\\me.txt");
        input.write("hello world!");
        input.close();
        // Using FileInputStream
        System.out.println("\nUsing FileI/OStreams");
        FileInputStream video=new FileInputStream("E:\\coding\\me.txt");
        System.out.println(video.available());
        System.out.println(video.getChannel());
        System.out.println(video.getFD());
        System.out.println(video.available());
        System.out.println("FileContents :");

        // Reading characters from FileInputStream
        // and write them
        int ch;

        // Holds true till there is data inside file
        while ((ch= video.read() ) != -1)
            System.out.print((char)ch);

        // Close the file connections
        // using close() method

        video.close();

        //Using FileOutputStream
        System.out.println("\nenter your name into the file");
        FileOutputStream out =new FileOutputStream("E:\\coding\\me.txt");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        char[] nam=name.toCharArray();
        for(int i=0;i<nam.length;i++){
            out.write(nam[i]);
        }
        System.out.println("name has been written Successfully....");
        out.close();

        System.out.println("\nUsing FileReader/Writer class");
        //Using FileReader class
        FileReader obj=new FileReader("E:\\coding\\me.txt");
        int read;
        System.out.println("content in the file:");
        while((read=obj.read())!=-1){
            System.out.print((char)read);
        }
        obj.close();

        //Using FileWriter Class
        FileWriter obj2=new FileWriter("E:\\coding\\me.txt");
        System.out.println("\nenter your content");
        String content=sc.nextLine();
        obj2.write(content);
        obj2.close();
    }
}
