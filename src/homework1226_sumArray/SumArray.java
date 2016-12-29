package homework1226_sumArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dhgof_000 on 2016-12-26.
 * 3개의 배열을 오름차순으로 “정렬된 하나의 배열”로 합치시오.

 * 정렬 알고리즘 구현해서 출력하도록.
 */
public class SumArray {
    public static void main(String[] args) {
        int[] arr1 = {3,6,4,7,1};
        int[] arr2 = {10,5,2,43,33,56};
        int[] arr3 = {8,78,44,52,9};

        int[] gettingArray = new int[arr1.length + arr2.length + arr3.length];

        System.arraycopy(arr1, 0, gettingArray, 0, arr1.length);
        System.arraycopy(arr2, 0, gettingArray, arr1.length, arr2.length);
        System.arraycopy(arr3, 0, gettingArray, arr2.length + arr3.length, arr3.length);

        for(int i=1; i < gettingArray.length ; i++){
            for(int j=0; j < gettingArray.length-i ; j++){
                if(gettingArray[j] > gettingArray[j+1]){
                    int temp=gettingArray[j];
                    gettingArray[j]=gettingArray[j+1];
                    gettingArray[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(gettingArray));
    }
}
