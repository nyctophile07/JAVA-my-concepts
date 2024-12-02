package suvam;

import java.nio.file.LinkPermission;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

interface book {
    public void borrow_a_Book();

    public void addBooks();

    public void returnBooks();

    public void showAvailableBooks();

    public void issuedBooks();

}

public class OnlineLibraerySystem implements book {
    static int bookcount = 0;
    static int availbooks = 8;
    Scanner input = new Scanner(System.in);
    static String[] books = new String[50];

    /*books[availbooks] ="you were my crush till you said i love you";
    books[1]="you are the best wife";
    books[2]="you are my reason to smile";
    books[3]="uzumaki";
    books[4]="ATTACK ON TITAN";*/

    String[] issuedbooks = new String[50];

    @Override
    public void showAvailableBooks() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("THE AVAILABLE BOOKS ARE:");
        System.out.println("SL  NAME");
        for (int i = 0; i < availbooks; i++) {
            System.out.println((i + 1) + "   " + books[i]);
        }
    }

    @Override
    public void borrow_a_Book() {
        System.out.println("HOW MANY BOOKS DO YOU WANT TO BORROW ?");
        int noOfbooks = input.nextInt();
        for (int i = 0; i <= noOfbooks - 1; i++) {
            System.out.println("enter the sl no. of book." + (i + 1));
            int slno = input.nextInt();
            issuedbooks[bookcount] = books[slno - 1];
            bookcount++;
        }
    }

    @Override
    public void issuedBooks() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int a = 1;
        if (issuedbooks[0] == null) {
            System.out.println("YOU HAVE NOT BORROW ANY BOOK TILL THE DATE");
        } else {
            System.out.println("YOUR ISSUED BOOKS ARE:");
            System.out.println("SL  NAME");
            for (int i = 0; i <= bookcount - 1; i++) {
                System.out.println(a + "   " + issuedbooks[i]);
                a++;
            }
        }
    }

    @Override
    public void returnBooks() {
        if (issuedbooks[0] == null) {
            System.out.println("YOU HAVE NOT BORROW ANY BOOK TILL THE DATE");
        } else {
            System.out.println("enter the SL.NO of your issuedbook");
            int slno = input.nextInt();
            bookcount--;
            for (int i = slno; i <= bookcount; i++) {
                issuedbooks[i - 1] = issuedbooks[i];
            }
        }
    }

    @Override
    public void addBooks() {
        System.out.print("enter");
        System.out.println(" the name of the book");
        //books[availbooks-1]=input.nextLine();// typical problem with Scanner class
        books[availbooks] = input.nextLine();
        System.out.println(books[availbooks] + "█ has been added to the library");
        availbooks++;
    }

    static void ops() {
        System.out.println("\n\n_______[CHOOSE YOUR OPERATION]_______" +
                "\n1.Show the available books " +
                "\n2.Add books to the collection" +
                "\n3.Borrow a book" +
                "\n4.Return a book" +
                "\n5.Show the books you have been issued" +
                "\n6.Exit the portal");
    }

    public static void main(String[] args) {
        // book bk=new OnlineLibraerySystem(); // object of interface "book" can be created using reference to the other class
        Scanner sc = new Scanner(System.in);
        System.out.print("USERNAME: ");
        String username = sc.nextLine();
        System.out.print("PASSWORD: ");
        String password = sc.nextLine();
        if (Objects.equals(username, "suvam") && Objects.equals(password, "viper77")) {
            // BOOK COLLECTION OF LIBRARY
            books[0] = "You were my crush till you said you love me";
            books[1] = "You are the best wife";
            books[2] = "You are my reason to smile";
            books[3] = "Uzumaki";
            books[4] = "ATTACK ON TITAN";
            books[5] = "Chainsaw man";
            books[6] = "ନମସ୍ତେ ରିକସାବାଲା ";
            books[7] = "The enigma of amigara fault";
            OnlineLibraerySystem me = new OnlineLibraerySystem();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\nWELCOME TO THE LOCAL LIBRAERY, BHUBANESWAR-751003");
            ops();
            System.out.print("\nopt: ");
            int choice = sc.nextInt();
            while (choice <= 6) {
                switch (choice) {
                    case 1 -> me.showAvailableBooks(); //working perfect
                    case 2 -> me.addBooks();        //working perfect
                    case 3 -> me.borrow_a_Book();   //working perfect
                    case 4 -> me.returnBooks();   //working perfect
                    case 5 -> me.issuedBooks();  // working perfect
                    case 6 -> System.exit(0);
                    case 0 -> ops();
                }
                System.out.print("\nopt: ");
                choice = sc.nextInt();
            }
        } else {
            System.out.println("xxxxxWRONG PASSWORD OR USERNAMExxxxx\n");
            main(args);
        }
    }

}
