package homework170207_stockInvestment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dhgof_000 on 2017-02-06.
 * 당신은 오늘 부터 N일(DAY) 동안의 삼성전자 주가를 예측할 수있는 알고리즘을 개발했다(와우~!!!).

 다만 현재 예산으로는 N일 동안 각각의 날에 다음의 액션중 하나만을 취할 수 있다.

 1) 어떤 날은 삼성전자 주식 1주를 살 수 있다.
 2) 어떤 날은 가지고 있는 주식 중 일부 혹은 전부를 팔 수 있다
 3) 어떤 날은 아무런 액션을 취하지 않을 수도 있다.

 N일 뒤에 최고의 수익을 남기기 위해서는 어떠한 전략을 수행해야 하는가?

 입력
 첫 줄에는 테스트 케이스의 수 T를 입력받는다.
 다음에는 숫자 N을 입력한다.
 그 다음 줄에는 N일 동안 예측한 주식의 가격을 입력한다. (모두 정수, 스페이스로 구분)
 이것을 T만큼 반복한다.

 출력
 각각의 테스트 케이스에 대해서 최고로 얻을 수 있는 수익을 출력한다.

 제한
 1 <= T <= 10
 1 <= N <= 50000

 입력 예제 #1
 3
 3
 5 3 2
 3
 1 2 100
 4
 1 3 1 2

 출력 예제 #1
 0
 197
 3

 예제 설명 #1
 첫번째 테스트 케이스
 주가가 5 > 3 > 2로 떨어지기만 한다. 이래서는 수익을 낼수가 없다.
 두번째 테스트 케이스
 1일과 2일에는 1주씩 구매한다. 3일때 모든 주식을 판매한다.
 세번째 테스트 케이스
 1일째 1주를 구매하고 2일째 이 것을 판매한다. 3일째 다시 1주를 구매하고 4일째 판매한다.
 */
public class StockInvestment {
    public static void main(String[] args) {
        //초기 입렵받을 준비 중...
        Scanner scan = new Scanner(System.in);
        ArrayList<int[]> arrayList = new ArrayList<>();

        //초기값 입력 받는 곳
        int testCase = scan.nextInt();
        for (int i = 0; i < testCase; i++) {
            int[] array = new int[scan.nextInt()];
            for (int j = 0; j < array.length; j++) {
                array[j] = scan.nextInt();
            }
            //각 입력 받은 배열들 리스트로 저장
            arrayList.add(array);
        }

        for (int i = 0; i < testCase; i++) {
            int total = getMoney(arrayList.get(i), 0, 0, 0);
            System.out.println(total);
        }
    }

    private static int getMoney(int[] array, int i, int sell, int buy) {
        //총 수익금 계산할 sell과 buy

        //현재 주식 값이 남은 일자보다 싼지 비싼지 확인
        int biggerPrice = bigger(array, i);

        //남은 일자보다 싸면 사고, 같거나 비싸면 팔고
        if (array[i] < biggerPrice){
            buy++;
            sell = sell - array[i];
        }else{
            sell = array[i]*buy + sell;
            buy = 0;
        }

        if (i != array.length-1){
            sell = getMoney(array, i+1, sell, buy);
        }

        if (sell < 0){
            return 0;
        }else{
            return sell;
        }
    }
    //남은 일자 중 비싼 값이 있나 확인
    private static int bigger(int[] array, int i) {
        int price = array[i];
        for (int j = i; j < array.length; j++) {
            if (array[i] < array[j]){
                price = array[j];
            }
        }
        return price;
    }
}
