package homeworkTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dhgof_000 on 2016-12-27.
 */
public class Changsoon {
    /**
     * 재귀를 짜는 쉬운방법은
     *
     * 1. 아래로 내려가는 방법을 짜.(전체를 돌수 있는 방법을 찾아)
     * 2. 예외를 찾아 .. 간단한거부터
     *      - 1번 예외는 입력 데이터가 없다.
     *      - 2번 예외는 더 이상 리프 데이터가 없다
     *      - 논리 예외를 찾아. 중복체크라든지, 4개 까지만 찾는다든지
     * @param args
     */


    public static void main(String args[]) {
        List<String> inputs = new ArrayList<>();
        inputs.add("a");
        inputs.add("c");
        inputs.add("i");
        inputs.add("s");
        inputs.add("t");
        inputs.add("w");
        for (String input : inputs) {
            List<String> outputs = new ArrayList<>();

            //a
            //c
            //i
            find(input, inputs, outputs);
        }
    }

    private static void find(String data, List<String> inputs, List<String> outputs) {
        // data 현재위치
        // inputs [a,c,i,s,t,w]
        // ouputs 내가 저장한 애들
        List<String> copyOutputs = new ArrayList<>(outputs);
        System.out.println(copyOutputs);
        /**
         * 현재 내 index 번호를 찾아
         */
        int index = 0;
        for (int i = 0 ; i < inputs.size() ; i++) {
            if (data.equals(inputs.get(i))) {
                index = i;
                break;
            }
        }

        /**
         * 내가 앞으로 더 돌건데 애가 4개 이하면 그냥 끝내
         */
        if (copyOutputs.size() + (inputs.size() - index) < 4) {
            return;
        }

        copyOutputs.add(inputs.get(index));

        if (copyOutputs.size() == 4) {
            System.out.println(copyOutputs);
            return;
        }

        for (int j = index ; j < inputs.size() ; j++) {
            if (j + 1 >= inputs.size()) {
                continue;
            }
            find(inputs.get(j + 1), inputs, copyOutputs);
        }
    }



}
