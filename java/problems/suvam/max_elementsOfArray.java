package suvam;

public class max_elementsOfArray {
    public static void main(String[] args) {
        int[] arr={222,4,5,936,7,66};
        int max=0;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println("the max element is "+max);
    }
}
