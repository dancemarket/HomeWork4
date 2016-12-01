package homework1117;

import homework1123.OhStack;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ola on 2016. 11. 17..
 */
public class HomeWork1177_Stack {
    public static Map<String, String> mapRule = new HashMap<>();

    public static void main(String[] args) {
        ruleCheck();
        System.out.println(check("<[{()}][{()()}]>"));
    }
    public static void ruleCheck(){
        mapRule.put("(", ")");
        mapRule.put("{", "}");
        mapRule.put("[", "]");
        mapRule.put("<", ">");
        //System.out.println("ruleCheck 구동되니?");
    }

    public static boolean check(String data) {
        OhStack ohStack = new OhStack();
        /*//OhStack에 잘 들어가는지 확인 = 잘 들어감
        ohStack.push((Character.toString(data.charAt(0))));
        System.out.println(ohStack.peek());
        */
        //홀수로 들어왔으면 바로 종료 --> 속도향상?
        if (data.length()%2 !=0 ){
            return false;
        }

        for (int i = 0; i < data.length(); i++) {
            String current = Character.toString(data.charAt(i));
            if (mapRule.containsKey(current)) {
                ohStack.push(current);
                //if 잘 돌아가는지 확인
                //System.out.print("if문 구동 되며 저장된 값은 : ");
                //System.out.println(ohStack.peek());
            }else {
                String top = ohStack.pop();
                //System.out.println("top의 값은 : " + top);
                if (isPair(top, current)) {
                    //System.out.println("isNotPair 구동중?");
                    return false;
                }
            }
        }
        return ohStack.empty();
    }
    public static boolean isPair(String top, String current){
        //HashMap에서 key와 value값 비교 할 수 있게
        String compare = mapRule.get(top);
        if (compare.equals(current)) {
            return false;
        }
        return true;
    }
}