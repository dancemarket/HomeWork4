package homework1204_sort;

import java.util.Arrays;

/**
 * Created by dhgof_000 on 2016-12-04.
 */
public class SortMain {
    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        int[] array = {5,1,6,3,5,9,2,8};
        System.out.println(Arrays.toString(bubble.bubble_sort(array)));
        System.out.println(Arrays.toString(mergeSort.merge_sort(array)));
    }
}
