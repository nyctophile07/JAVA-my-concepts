package suvam;

import java.util.Scanner;
public class check_a_website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = ".com";
        String str2 = ".in";
        String str3 = ".org";
        System.out.println("enter your website");
        String webs = input.nextLine();
        boolean web = webs.endsWith(str1);
        boolean web1 = webs.endsWith(str2);
        boolean web2 = webs.endsWith(str3);
        if (web) {
            System.out.println("your website is a commercial website");
        } else if (web1) {
            System.out.println("your website is a indian website");
        } else if (web2) {
            System.out.println("your website is a organisational website");
        }
    }
}
