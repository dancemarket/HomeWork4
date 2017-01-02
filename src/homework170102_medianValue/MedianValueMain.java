package homework170102_medianValue;

import java.util.Scanner;

/**
 * Created by 205-121 on 2017-01-02.
 */
public class MedianValueMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] nArray = new int[N];
        int[] kArray = new int[K];
        int total = 0;
        for (int i = 0; i < nArray.length; i++) {
            if (i<K-1){
                nArray[i] = scan.nextInt();
            }else {
                nArray[i] = scan.nextInt();
                int count = 0;
                for (int j = i; j > i-K; j--) {
                    kArray[count] = nArray[j];
                    count++;
                }
                total = total + kArray[((K+1)/2)-1];
            }
        }
        System.out.println(total);
    }

}
