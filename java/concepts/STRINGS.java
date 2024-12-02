import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class STRINGS {
    public static void main(String[] args) {
        System.out.println("whats your name ?");
    Scanner input= new Scanner(System.in);
    String name= input.nextLine();
        // name.length() is used to get the length of string
        System.out.println("the length of your name is "+name.length());

        //name.toLowerCase() for lowercase and name.toUpperCase() for uppercase
        System.out.println("your name in lowercase "+name.toLowerCase());
        System.out.println("your name in uppercase "+name.toUpperCase());

        //name.trim is used to cut the spaces
        String str3= "     suvu   ";
        System.out.println("our new string is '"+str3+"' and after trimming the spaces the string now is '"+str3.trim()+"'");

        //name.substring(3) is used to show the substring from the given index
        System.out.println("the new substring is "+name.substring(3));

        //name.substring(2,5) is used to show a substring but it comes with a start and end value
        System.out.println("the new substring is "+name.substring(2,5));

        //name.replace(u,i) is used to replace a char with another one
        System.out.println("after replacing 'i' with 'u' "+name.replace('u','i'));

        //name.startswith(su) is used to check whether the string begins with the given char
        //name.endswith(m) is used to check whether the stirng ends with the given char
        System.out.println(name.startsWith("su"));
        System.out.println(name.endsWith("m"));

        //name.charAt is used to show the char at the given position
        System.out.println("the 3rd char in the string is "+name.charAt(2));

        //name.equals("suvam") is used to match/compare to string with a given one
        //name.equalsIgnoreCasef("suvam") will compare too but now irrespective of case
        String str1="the name matched successfully";
        String str2="the name didn't matched";
        boolean as=name.equals("suvam");
        boolean ass=name.equalsIgnoreCase("suvam");
        System.out.println( as?str1:str2 + " (case sensetive)");
        System.out.println( ass?str1:str2);

    }
}
