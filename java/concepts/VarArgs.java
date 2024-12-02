public class VarArgs {
    static int sum(int x,int ...arr){   // here atleast one argument is needed for x
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        return sum+x;
    }
    public static void main(String[] args) {
        System.out.println("the result is "+sum(1,33,10));
    }
}
