package homework1230_numberSelect;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dhgof_000 on 2016-12-30.
 */
/*1~45까지의 로또 번호 중에서
  당첨 번호로 예상되는 수가 10개 중 로또 6개 고르기…
  조건.. 중복은 안되고(10개의 수 중복 없이 입력),
  모든 수의 합이 3, 5의 배수면 안돼
  가능한 6개의 수 출력
*/
public class NumberSelect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] expectNumber = new int[10];
        int[] lottoNumber = new int[6];
        for (int i = 0; i < 10; i++) {
            expectNumber[i] = scan.nextInt();
            //중복 걸러주기
            for (int j = 0; j < i; j++) {
                if (expectNumber[i] == expectNumber[j]){
                    i--;
                }
            }
        }
        //숫자 잘 받아오고
        //System.out.println(Arrays.toString(expectNumber));

        select(lottoNumber, expectNumber, 0, 10, 6, 0);
    }

    private static void select(int[] lottoNumber, int[] expectNumber, int lottoIndex, int n, int r, int expectIndex) {
        if (lottoIndex == r){
            //delete3and5(lottoNumber);
            System.out.println(Arrays.toString(lottoNumber));
            return;
        }
        if ( n == expectIndex){
            return;
        }
        lottoNumber[lottoIndex] = expectNumber[expectIndex];
        select(lottoNumber, expectNumber, lottoIndex+1, n, r, expectIndex+1);
        select(lottoNumber, expectNumber, lottoIndex, n, r, expectIndex+1);
    }

    private static void delete3and5(int[] lottoNumber) {
        int total = 0;
        for (int i = 0; i < lottoNumber.length; i++){
            total += lottoNumber[i];
        }
        //3의배수 5의 배수 조건 삭제
        if (total % 3 != 0 && total % 5 != 0){
            System.out.println(Arrays.toString(lottoNumber));
        }
    }

}
