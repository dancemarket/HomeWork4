package homework1226_sumArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dhgof_000 on 2016-12-26.
 * 3개의 배열을 오름차순으로 “정렬된 하나의 배열”로 합치시오.

 Input
 arr1 = { 3, 6, 4, 7, 1 }
 arr2 = { 10, 5, 2, 43, 33, 56 }
 arr3 = { 8, 78, 44, 52, 9 }

 Output
 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 33, 43, 44, 52, 56, 78 }

 sorting 알고리즘은 구현하지 않음. 본인이 알고있는 라이브러리 사용
 */
public class SumArray {
    public static void main(String[] args) {
        int[] arr1 = {3,6,4,7,1};
        int[] arr2 = {10,5,2,43,33,56};
        int[] arr3 = {8,78,44,52,9};
        int num1 = arr1.length;
        int num2 = arr2.length;
        int num3 = arr3.length;
        List<Integer> collectArray = new ArrayList<>();
        for (int i = 0; i < num1; i++) {
            collectArray.add(arr1[i]);
        }
        for (int i = 0; i < num2; i++) {
            collectArray.add(arr2[i]);
        }
        for (int i = 0; i < num3; i++) {
            collectArray.add(arr3[i]);
        }


        for (int i = 0; i < collectArray.size()-1; i++) {
            for (int j = 1; j < collectArray.size(); j++) {
                if(collectArray.get(i) > collectArray.get(j)){
                    int temp = collectArray.get(j);
                    Integer s = collectArray.get(i);
                    s = temp;
                }
            }
        }

        System.out.println(collectArray);

    }
}
