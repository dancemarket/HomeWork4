package homework170206_CheckingAi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dhgof_000 on 2017-02-06.
 * [A1][A2]....[An]으로 이루어진 배열이 있다. 이 배열에서 다음의 조건을 만족하는 요소 Ai가 있는지 검사하는 프로그램을 작성하시오
 1. Ai의 왼쪽에 있는 요소들의 합과 오른쪽에 있는 요소들의 합이 동일하다.
 2. 왼쪽이나 오른쪽에 요소가 없다면 (A1이거나 An이라면) 합은 0으로 간주한다.

 즉 [A1] + [A2].... [Ai-1] = [Ai+1] + [Ai+2] + [An]

 입력
 첫 번째 줄에 테스트 케이스의 수를 입력한다.
 각 테스트 케이스에서 첫번째 줄은 배열의 크기 N을 그 다음 줄은 스페이스로 구분한 배열의 요소들을 입력받는다.

 출력
 각각의 테스트 케이스에 대해서 Ai가 존재하면 YES를 그렇지 않으면 No를 출력한다.

 입력 예제 #1
 2
 3
 1 2 3
 4
 1 2 3 3

 출력 예제 #1
 NO
 YES

 예제 설명 #1
 첫번째 케이스에서는 만족하는 것을 찾을 수 없다.
 두번째 케이스에서는 A[1] + A[2] = A[4]이다.

 가산점

 왼편, 오른편의 합을 구할 때 처리 속도를 빠르게 처리하면 가산점이 있습니다.
 */
public class CheckingAi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //총 문제 케이스 받는 변수
        int caseCount = scan.nextInt();

        //각 케이스에 대한 배열 입력
        ArrayList<int[]> arrayList = new ArrayList<>();
        for (int i = 0; i < caseCount; i++) {
            int imsiLength = scan.nextInt();
            int[] array = new int[imsiLength];
            for (int j = 0; j < imsiLength; j++) {
                array[j] = scan.nextInt();
            }
            arrayList.add(array);
        }

        //각 문제에 대한 테스트 진행
        for (int i = 0; i < caseCount; i++) {
            sayYesOrNo(arrayList.get(i));
        }
    }

    //결과값이 YES 인지 NO인지 확인
    private static void sayYesOrNo(int[] array) {
        String result = "NO";
        //배열의 길이가 1개라면
        if (array.length == 1){
            System.out.println("YES");
            return;
        }else if (array.length == 2){       //배열의 길이가 2개라면
            if ( 0 == array[1] || array[0] == 0) {
                System.out.println("YES");
                return;
            }else {
                System.out.println("NO");
                return;
            }
        }else {                             //배열의 길이가 3개 이상이라면
            for (int i = 0; i < array.length; i++) {
                int left = arrayCalculatorLeft(array, i);
                int right =arrayCalculatorRight(array, i);
                if (left == right){
                    result = "YES";
                }
            }
        }
        //최종 결과값을 출력해주기
        System.out.println(result);
    }

    //배열의 왼쪽 계산
    private static int arrayCalculatorLeft(int[] array, int i) {
        int result = 0;
        for (int j = 0; j < i; j++) {
            result = result + array[j];
        }
        return result;
    }

    //배열의 오른쪽 계산
    private static int arrayCalculatorRight(int[] array, int i) {
        int result = 0;
        for (int j = i + 1; j < array.length; j++) {
            result = result + array[j];
        }
        return result;
    }
}
