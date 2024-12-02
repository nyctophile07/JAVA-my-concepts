package suvam;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr={11,2,3,5,99};
        int temp=0;
        int mid=arr.length/2;
        for(int i=0;i<=mid;i++){
            temp=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=temp;
        }

        for (int a:arr) {
            System.out.println(a);
        }
    }
}
