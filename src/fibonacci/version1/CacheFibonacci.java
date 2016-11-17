package fibonacci.version1;

/**
 * Created by dhgof_000 on 2016-11-17.
 */
public class CacheFibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }

    private static int fibo(int n) {
        if(n<2){
            return 1;
        }return fibo(n-2) + fibo(n-1);
    }
//    public int fibo(int n){
//
//        return fibo(n-2) + fibo(n-1);
//    }
}
