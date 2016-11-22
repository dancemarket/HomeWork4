package fibonacci.version2;

import java.util.HashMap;
import java.util.Scanner;

public class CacheFibonacci {

    static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String cuti = "xx";
        while(cuti.equals("xx")){
            fiboWork();
            System.out.println("중단하고 싶으면 end를 계속하고 싶으면 아무키입력 후 엔터");
            cuti = scan.next();
            if(cuti.equals("end")){
                System.out.println("피보나치 종료");
            }else{
                cuti = "xx";
            }
        }
    }
    public static void fiboWork(){
        System.out.println("피보나치 수열을 구하고 싶은 숫자를 입력하시오");
        int fiboNum = scan.nextInt();
        System.out.println("피보나치 수: " + fibo(fiboNum));
    }
    public static int fibo(int n) {
        int[] arry = new int[n];
        if (map.containsKey((n-1))) {
            //System.out.println("캐시에서 가져옴");
            return map.get((n-1));
        }else {
            for (int i = 0; i < n; i++) {
                if (i < 2) {
                    arry[i] = 1;
                } else {
                    arry[i] = arry[i - 2] + arry[i - 1];
                }
                //System.out.println("처음가져옴");
                map.put(i, (arry[i]));
            }
            return map.get((n - 1));
        }
    }
}
