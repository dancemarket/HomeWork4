package fibonacci.version2;

/**
 * Created by dhgof_000 on 2016-11-17.
 */
public class CacheFibonacci {
    public static void main(String[] args) {
        int[] arry = new int[3];    //임의로 3이라는 숫자 넣어놓음
        for (int i = 0; i < arry.length; i++) {
            if (i<2){
                arry[i] = 1;
            }else{
                arry[i] = arry[i-2] + arry[i-1];
            }
        }
        System.out.println(arry[2]);
    }
}
