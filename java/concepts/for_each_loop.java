import java.util.Scanner;
public class for_each_loop {
    public static void main(String[] args) {
        int[] arr = {1,3,5,234,52,521};
        System.out.println("the length of array is "+arr.length);
        System.out.println("printing the array elements using FOR EACH LOOP");
        for(int i:arr){
            System.out.println(i);
        }
        /*
           for(int i=0; i<arr.length; i++)
           {
           System.out.println(arr[i]);
           }
        */
    }
}
