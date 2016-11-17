package fibonacci.version1;

/**
 * Created by dhgof_000 on 2016-11-17.
 */
public class NoCacheFibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }

    public static int fibo(int n) {
        if(n<2){
            return 1;
        }

        return fibo(n-2) + fibo(n-1);
    }
}
