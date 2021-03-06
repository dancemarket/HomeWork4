package homework1123_Stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dhgof_000 on 2016-11-23.
 */
public class OhStack {
    //List 사용하기로 약속됨, List 선언
    public static List<String> list = new ArrayList<>();

    // boolean	empty() : Tests if this stack is empty.
    public static boolean empty() {

        if (list.size() != 0){
            return false;
        }
        return true;
    }

    //  E	push(E item) : Pushes an item onto the top of this stack.
    public static void push(String c) {
        list.add(c);
    }

    //  E	peek() : Looks at the object at the top of this stack without removing it from the stack.
    public static String peek(){
        String take = list.get((list.size())-1);
        return take;
    }

    //  E	pop() : Removes the object at the top of this stack and returns that object as the value of this function.
    public static String pop() {
        String take = list.get((list.size())-1);
        list.remove((list.size())-1);
        return take;
    }
}
