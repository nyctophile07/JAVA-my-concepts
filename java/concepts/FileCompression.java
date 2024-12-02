import java.io.*;
import java.util.*;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

import javax.swing.JFrame;

public class FileCompression {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("what do you want to perform\n1.Compression\n2.Decompression");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("put double '\\' by directories while putting the address\n");
        if (choice == 1) {
            System.out.println("enter the address of the file you want to compress");
            String file1 = sc.nextLine();           //"E:\\coding\\literally me.jpg";
            System.out.println("enter the address to store your compressed file");
            String file2 = sc.nextLine();           //"E:\\coding\\compressed.txt";
            FileInputStream fin = new FileInputStream(file1);
            FileOutputStream fout = new FileOutputStream(file2);
            DeflaterOutputStream out = new DeflaterOutputStream(fout);
            int ch;
            while ((ch = fin.read()) != -1) {
                out.write(ch);
            }
            out.close();
            fout.close();
            System.out.println("Successfully compressed....");
        } else if (choice == 2) {
            System.out.println("enter the address of the compressed file");
            String file1=sc.nextLine();
            FileInputStream compressed = new FileInputStream(file1);
            System.out.println("enter the address to store the decompressed file");
            String file2=sc.nextLine();
            FileOutputStream decompressed = new FileOutputStream(file2);
            InflaterInputStream decompressor = new InflaterInputStream(compressed);
            int cha;
            while ((cha=decompressor.read())!=-1){
                decompressed.write(cha);
            }
            decompressed.close();
            decompressor.close();
            System.out.println("Successfully decompressed....");
        } else {
            System.err.println("Choose the correct option");
            main(args);
            System.exit(0);
        }
    }
}


