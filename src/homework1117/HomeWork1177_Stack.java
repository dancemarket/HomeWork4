package homework1117;

import homework1123.OhStack;

/**
 * Created by ola on 2016. 11. 17..
 */
public class HomeWork1177_Stack {

    public static void main(String[] args) {
        System.out.println(check("[{()}][{()()}]"));
    }

    public static boolean check(String data) {
        OhStack ohStack = new OhStack();
        /*//OhStack에 잘 들어가는지 확인 = 잘 들어감
        ohStack.push((Character.toString(data.charAt(0))));
        System.out.println(ohStack.peek());
        */
        //홀수로 들어왔으면 바로 종료
        if (data.length()%2 !=0 ){
            return false;
        }

        for (int i = 0; i < data.length(); i++) {
            if ((Character.toString(data.charAt(i))).equals("(")
                    || (Character.toString(data.charAt(i))).equals("{")
                    || (Character.toString(data.charAt(i))).equals("[")){
                ohStack.push((Character.toString(data.charAt(i))));
                //if 잘 돌아가는지 확인
                //System.out.println(OhStack.peek());
            }else if ((Character.toString(data.charAt(i))).equals(")")){
                if (((ohStack.peek()).equals("("))){
                    //if 잘 돌아가는지 확인
                    //System.out.println(OhStack.peek());
                    ohStack.pop();
                }else{
                    return false;
                }
            }else {
                if ((Character.toString(data.charAt(i))).equals("}")) {
                    if (((ohStack.peek()).equals("{"))) {
                        ohStack.pop();
                    } else {
                        return false;
                    }
                } else {
                    if (((ohStack.peek()).equals("["))) {
                        ohStack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (ohStack.empty()){
            return true;
        }
        return false;
    }
}