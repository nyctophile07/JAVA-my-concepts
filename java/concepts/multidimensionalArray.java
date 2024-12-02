
import java.util.*;
public class multidimensionalArray{
    public static void main(String[] args) {
        System.out.println("enter the length of your matrix");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        System.out.println("enter the breadth of your matrix");
        int breadth=sc.nextInt();
        int[][] arr=new int[length][breadth];
        for(int i=0;i<length;i++){
            for(int j=0;j<breadth;j++){
                System.out.format("enter the value for a[%d][%d] ",i,j);
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nYOUR MATRIX HERE !");
        for(int i=0;i<length;i++){
            for(int j=0;j<breadth;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //System.out.println("the length of my matrix is "+arr.length+" and the breadth is "+arr[0].length);
    }
}