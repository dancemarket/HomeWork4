package homework170104_findBigArraySize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 205-121 on 2017-01-04.
 */
public class BigArraySize {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -5, -4, -3, -2};
        List<Integer> list = new ArrayList<>();
        Arrays.sort(input);
        int resultNumber = 0;
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            resultNumber = bigArraySize(list, input, i, 1, 0);
            if (result < resultNumber){
                result = resultNumber;
            }
        }
        System.out.println(result);
    }

    private static int bigArraySize(List list, int[] input, int i, int j, int resultArraySize) {
        List<Integer> copyList = new ArrayList<>(list);
        copyList.add(input[i]);
        int sum = 0;
        for (int k = 0; k < copyList.size(); k++) {
            sum = sum + copyList.get(k);
        }
        if (sum == j && copyList.size() > resultArraySize){
            resultArraySize = copyList.size();
            return resultArraySize;
        }
        //인덱스가 끝이라면 종료
        if (i == input.length-1){
            return resultArraySize;
        }

        for (int k = i+1; k < input.length; k++) {
            int result = bigArraySize(copyList, input, k, j, resultArraySize);
            if (resultArraySize < result){
                resultArraySize = result;
            }
        }

        return resultArraySize;
    }
}
