package homework170206_9with0;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dhgof_000 on 2017-02-06.
 * 숫자 0과 9로만 이루어진 0 이상의 정수 X가 있다. (ex: 90, 9990, 9009009)
 0이상의 정수 N이 주어졌을 때 X중 N의 배수이면서 가장 작은 수를 구하는 프로그램을 작성하시요.

 입력
 첫줄에 테스트 케이스 T를 입력 받는다. 다음 줄 부터 T줄만큼 N을 입력받는다.

 출력
 각각의 테스트 케이스에 대해서 조건 만족하는 수 X를 한줄에 하나씩 출력한다. 단 숫자 앞에 0이 와서는 안된다.
 (ex: 00999 > 999로 출력할 것)

 제한
 1 <= T <= 104
 1 <= N <= 500

 입력 예제 #1
 3
 5
 7
 1

 출력 예제 #1
 90
 9009
 9

 예제 설명 #1
 첫번째 테스트 케이스 : 5의 배수이면서 9와 0으로만 이루어진 가장 작은 수는 90이다.
 */

public class MinimumNumber9with0 {
    public static void main(String[] args) {
        //초기값 입력 받을 준비
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        int[] array = new int[testCase];

        //초기값 입력
        for (int i = 0; i < testCase; i++) {
            array[i] = scan.nextInt();
        }
        //9와 0으로 이루어지고 해당 값의 배수인 숫자를 찾으러 갑시다
        for (int i = 0; i < array.length; i++) {
            minimumNumber(array[i]);
        }
    }

    //해당 숫자를 찾아 출력하는 메소드
    private static void minimumNumber(int i) {
        int q = 1;
        for (int j = 1 ; ; j = j + (q*2)) {
            for (int k = 0; k < j; k++) {
                int[] numbers = makeNumber(j);
                //number가 N의 배수인가?
                for (int l = 0; l < numbers.length; l++) {
                    int multiple = numbers[l] % i;
                    if (multiple == 0){
                        System.out.println(numbers[l]);
                        return;
                    }
                }
            }
        }
    }

    //9와 0으로 이루어진 숫자 만들어주기
    private static int[] makeNumber(int j) {
        int[] numbers = new int[j];
        for (int i = 1; i <= j; i++) {
            Integer binary = Integer.parseInt(Integer.toBinaryString(i));
            numbers[i-1] = binary * 9;
        }
        Arrays.sort(numbers);
        return numbers;
    }
}
