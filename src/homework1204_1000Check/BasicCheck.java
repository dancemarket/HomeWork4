package homework1204_1000Check;

import java.util.Stack;

/**
 * Created by dhgof_000 on 2016-12-04.
 */
public class BasicCheck {
    public static void main(String[] args) {
        System.out.println(Thousands(100000));
    }
    public static String Thousands(int data){
        Stack<Character> stack = new Stack();
        String getNumber = String.valueOf(data);
        String printThousands = "";
        for (int i = 0; i < getNumber.length(); i++) {
            stack.push(getNumber.charAt(i));
        }
        for (int i = 0; i < getNumber.length(); i++) {
            if (((i+1)%4) == 0){
                printThousands = stack.pop() + printThousands;
                printThousands = " " + printThousands;
            }else{
                printThousands = stack.pop() + printThousands;
            }
        }
        return printThousands;
    }
}


