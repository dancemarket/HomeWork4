package homework170121_nineArray;

import java.util.ArrayList;
import java.util.List;

import static homework170121_nineArray.NineArray.array;

/**
 * Created by dhgof_000 on 2017-01-21.
 */
public class Stack1 {
    int index;
    List<Integer> list = new ArrayList<>();
    public void push(int number){
        if (index < 3){
            list.add(number);
            array[index] = list.get(index);
            index++;
        }else {
            System.out.println("스택을 초과 하였습니다");
        }
    }
    public void pop(){
        if (index > -1){
            list.set(index, null);
            array[index] = list.get(index);
            index--;
        }else {
            System.out.println("스택이 비어 있습니다");
        }
    }
}
