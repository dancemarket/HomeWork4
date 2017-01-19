package homework170117_GermanLotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dhgof_000 on 2017-01-17.
 */
public class LottoWork {

    //배열 크기와 배열 값을 입력 받고, 작업이 다 끝나면 0으로 종료 하는 메소드
    Scanner scan = new Scanner(System.in);
    List<int[]> lottoArrays = new ArrayList<>();
    public void lottoMake(){
        int k = 1;
        // k값과 그에 해당하는 로또 번호 입력 받고
        while(true){
            k = scan.nextInt();
            if (k == 0){
                break;
            }else {
                int[] getNumbers = new int[k];
                for (int i = 0; i < k; i++) {
                    getNumbers[i] = scan.nextInt();
                }
                lottoArrays.add(getNumbers);
            }
        }

        for (int i = 0; i < lottoArrays.size(); i++) {
            int[] lottoExpect = new int[6];
            printLotto(lottoArrays.get(i), lottoExpect, 6, 0, 0);
        }
    }

    //넘겨 받은 배열 프린트 합시다
    public void printLotto(int[] arrays, int[] lottoExpect, int total, int arraysCount, int expectCount){
        //배열 제대로 넘어오는가 = ok
        //System.out.println(Arrays.toString(arrays));

        //로또 번호 6개 모이면 출력
        if (expectCount == total){
            System.out.println(Arrays.toString(lottoExpect));
            return;
        }
        //현재 번호가 마지막 번호라면 얼른 종료
        if (arraysCount == arrays.length){
            return;
        }

        lottoExpect[expectCount] = arrays[arraysCount];
        printLotto(arrays, lottoExpect, total, arraysCount+1, expectCount+1);
        printLotto(arrays, lottoExpect, total, arraysCount+1, expectCount);
    }
}
