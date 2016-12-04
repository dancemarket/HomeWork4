package homework1204_sort;

import java.util.Arrays;

/**
 * Created by dhgof_000 on 2016-12-04.
 */
public class SortMain {
    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        int[] array = {5,4,8,3,9,5,2,7,1,13,11,0};
        System.out.println(Arrays.toString(bubble.bubble_sort(array)));
    }
}
