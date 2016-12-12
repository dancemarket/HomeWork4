package homework1207_binarySearch;

import java.util.Arrays;

/**
 * Created by dhgof_000 on 2016-12-08.
 */
public class SearchMain {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        BinarySearch_jwagui bsjg= new BinarySearch_jwagui();
        int[] array = {5,1,6,3,5,9,2,8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("찾고자 하는 수의 인덱스는 : " + bs.findIndex(array, 8));
        System.out.println("찾고자 하는 수의 인덱스는 : " + bsjg.findIndexJG(array, 8, 0, array.length));
    }
}
