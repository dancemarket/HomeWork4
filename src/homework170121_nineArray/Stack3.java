package homework170121_nineArray;

import java.util.ArrayList;
import java.util.List;

import static homework170121_nineArray.NineArray.array;

/**
 * Created by dhgof_000 on 2017-01-21.
 */
public class Stack3 {
    int index;
    List<Integer> list = new ArrayList<>();
    public void push(int number){
        if (index < 3){
            list.add(number);
            array[index+6] = list.get(index);
            index++;
        }else {
            System.out.println(number+"에 대한 작업을 하기엔"+"스택을 초과 하였습니다");
        }
    }
    public void pop(){
        if (index > -1){
            list.set(index, null);
            array[index+3] = list.get(index);
            index--;
        }else {
            System.out.println("스택이 비어 있습니다");
        }
    }
}
