package homework1204_1000Check;

import java.util.Stack;

/**
 * Created by dhgof_000 on 2016-12-04.
 */
public class UpgradeCheck {
    public static void main(String[] args) {
        //Thousands(int갯수마다, "프린트 하고싶은 문자", 표현해야 하는 int 숫자);
        System.out.println(Thousands(4, "|" ,100000));
    }
    public static String Thousands(int count, String print, int data){
        Stack<Character> stack = new Stack();
        String getNumber = String.valueOf(data);
        String printThousands = "";
        for (int i = 0; i < getNumber.length(); i++) {
            stack.push(getNumber.charAt(i));
        }
        for (int i = 0; i < getNumber.length(); i++) {
            if (((i+1)%count) == 0){
                printThousands = stack.pop() + printThousands;
                printThousands = print + printThousands;
            }else{
                printThousands = stack.pop() + printThousands;
            }
        }
        return printThousands;
    }
}
