package homework170121_nineArray;

import java.util.Arrays;

/**
 * Created by dhgof_000 on 2017-01-21.
 */
public class NineArray {
    static Integer[] array = new Integer[9];
    public static void main(String[] args) {
        Stack1 stack1 = new Stack1();
        Stack2 stack2 = new Stack2();
        Stack3 stack3 = new Stack3();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack2.push(4);
        System.out.println(Arrays.toString(array));
    }

}
