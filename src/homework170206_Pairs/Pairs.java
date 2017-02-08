package homework170206_Pairs;

import java.util.Arrays;
import java.util.Scanner;

 /**
 * Created by dhgof_000 on 2017-02-06.
 * N개의 정수가 주어졌을 때 그 차가 K인 정수 쌍의 수를 구하시오

 입력
 첫째 줄에 N, K를 입력받는다. (스페이스로 구분)
 두번째 줄부터 N개의 정수를 입력받는다. 단, 모든 정수는 그 값이 서로 달라야 한다. (스페이스로 구분)

 출력
 차가 K인 정수 쌍의 수를 출력한다.

 제한
 N <= 10^5
 0 < K < 10^9
 각 정수는 0보다 크고 2^31 - 1 보다 작다.

 예제 입력 #1
 5 2
 1 5 3 4 2

 예제 출력 #1
 3

 예제 입력 #2
 10 1
 363374326 364147530 61825163 1073065718 1281246024 1399469912 428047635 491595254 879792181 1069262793

 예제 출력 #2
 0

 가산점

 N개의 정수를 입력받았을 때 각각의 차가 K인것을 체크하려면 N^2의 비교가 필요하고 N이 커질수록 처리속도가 급격히 증가하게 된다.
 이를 해결하기 위해 Time Complecity가 O(N log N)이거나 이보다 효율적으로 구현하도록 구현 하면 가산점 추가됨.
 */
public class Pairs {


    public static void main(String[] args) {
        //정수들의 차가 k값인 수를 카운트 해줄 변수
        int result = 0;

        Scanner scan = new Scanner(System.in);
        //첫째 줄에 n,k를 입력 받는다
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arrayN = new int[n];

        //두번째 줄에 총 n개의 정수 입력 받음
        for (int i = 0; i < n; i++) {
            arrayN[i] = scan.nextInt();
        }
        //입력 받은 정수 차를 정수로 잘 계산하기 위해 정렬해줌
        Arrays.sort(arrayN);

        //잘 정렬 받은 배열을 정수차를 구하기 위해 넘겨줌
        for (int i = 0; i < n-1; i++) {
            result = negativeCalculator(arrayN, arrayN[i], i+1, result, k);
        }

        //결과 값 출력
        System.out.println(result);
    }

    //두 정수의 차이를 계산하는 메소드
    private static int negativeCalculator(int[] arrayN, int i, int i1, int count, int k) {
        //정수차는?
        int result = arrayN[i1] - i;
        //정수차가 k라면
        if (result == k){
            count++;
        }
        //배열의 끝에 왔다면 종료 아니면 계속
        if (i1 == (arrayN.length -1)){
            return count;
        }
        count = negativeCalculator(arrayN, i, i1+1, count, k);

        return count;
    }
}
