package suvam;

public class reverseAstring {
    public static void main(String[] args) {
        char str;
        char str1;
        StringBuilder name=new StringBuilder("suvam");
        for(int i=0;i<(name.length()/2);i++){
            str=name.charAt(i);
            str1=name.charAt(name.length()-1-i);

            name.setCharAt(i,str1);
            name.setCharAt((name.length()-1-i),str);
        }
        System.out.println(name);
    }
}
