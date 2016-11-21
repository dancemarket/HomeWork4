package fibonacci.version2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CacheFibonacci {

    public static void main(String[] args) {
        fiboWork();

    }
    public static void fiboWork(){
        Scanner scan = new Scanner(System.in);
        System.out.println("피보나치 수열을 구하고 싶은 숫자를 입력하시오");
        int fiboNum = scan.nextInt();
        System.out.println(fibo(fiboNum));
    }
    public static int fibo(int n) {
        int[] arry = new int[n];
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        if (m.containsKey(n-1)) {
            System.out.println("캐시에서 가져옴");
            return m.get(n-1);
        }else{
            for (int i = 0; i < n; i++) {
                if (i<2){
                    arry[i] = 1;
                }else{
                    arry[i] = arry[i-2] + arry[i-1];
                }
                System.out.println("처음가져옴");
            }
            m.put(n-1,arry[n-1]);
            return m.get(n-1);
        }
    }
}
