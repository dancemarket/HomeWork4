package homework1204_sort;

/**
 * Created by dhgof_000 on 2016-12-05.
 */
public class MergeSort {
    public int[] merge_sort(int[] array){
        //배열을 분할
        if (array.length > 1) {
            int[] arrayA = new int[array.length / 2];
            int[] arrayB = new int[array.length - arrayA.length];
            int aryCount = 0;
            for (int i = 0; i < arrayA.length; i++, aryCount++) {
                arrayA[i] = array[aryCount];
            }
            for (int i = 0; i < arrayA.length; i++, aryCount++) {
                arrayB[i] = array[aryCount];
            }

            arrayA = merge_sort(arrayA);
            arrayB = merge_sort(arrayB);
            //나눠진 배열을 정렬할거임, 메소드 소환
            array = merge_work(arrayA, arrayB);
            return array;
        }

        return array;
    }
    //분할 된 배열을 확인 하고 숫자를 정렬
    public static int[] merge_work(int[] arrayA, int[] arrayB){
        //정렬하고 저장할 배열을 생성, 배열 위치 움직일 변수 생성
        int aCount = 0;
        int bCount = 0;
        int abCount = 0;
        int[] array = new int[arrayA.length+arrayB.length];

        while (array.length > abCount && arrayA.length > aCount && arrayB.length > bCount){
            if (arrayA[aCount] > arrayB[bCount]){
                array[abCount] = arrayB[bCount];
                bCount++;
                abCount++;
            }else{
                array[abCount] = arrayA[aCount];
                aCount++;
                abCount++;
            }
        }
        while (arrayA.length > aCount){
            array[abCount] = arrayA[aCount];
            aCount++;
            abCount++;
        }
        while (arrayB.length > bCount){
            array[abCount] = arrayB[bCount];
            bCount++;
            abCount++;
        }

        return array;
    }
}
