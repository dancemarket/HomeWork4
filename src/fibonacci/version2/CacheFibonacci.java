package fibonacci.version2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dhgof_000 on 2016-11-17.
 */
public class CacheFibonacci {

    static int[] data = new int[100];

    public static void main(String[] args) {
        System.out.println(fibo(10));
        System.out.println(fibo(5));
        System.out.println(fibo(2));
    }

    public static int fibo(int n) {
        int[] arry = new int[n];    //임의로 3이라는 숫자 넣어놓음

        if (data.length > n && data[n] != 0) {
            return data[n-1];
        }
        System.out.println("fibo " + n);

        for (int i = 0; i < n; i++) {
            if (i<2){
                arry[i] = 1;
            }else{
                arry[i] = arry[i-2] + arry[i-1];
            }

            data[i] = arry[i];
        }
        return arry[n-1];
    }
}
