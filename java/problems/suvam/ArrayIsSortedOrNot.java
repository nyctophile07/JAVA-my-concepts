package suvam;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("the array is not sorted");
                System.exit(0);
            }
        }
        System.out.println("the array is sorted");
    }
}
