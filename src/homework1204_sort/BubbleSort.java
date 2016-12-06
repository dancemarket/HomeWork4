package homework1204_sort;

/**
 * Created by dhgof_000 on 2016-12-04.
 */

//버블 소트 시간복잡도 n^2
//맨 뒤에서 부터 큰 수가 차례대로 쌓임
public class BubbleSort {
    public int[] bubble_sort(int[] array) {
        for(int i=1; i < array.length ; i++){
            for(int j=0; j < array.length-i ; j++){
                if(array[j] > array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
}
