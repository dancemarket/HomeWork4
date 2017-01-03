package homework170103_calculatorBasic;

import java.util.*;

/**
 * Created by 205-121 on 2017-01-03.
 * 계산하는 방법은 연산자가 나올 때까지 읽어서 연산자의 앞에 있는 피연산자 두개를 이용하여 계산하고 그 자리에 저장한다.
 * 중위식을 후위식으로 쉽게 바꾸는 방법, 중위식에 괄호를 친 다음 연산자를 괄호 뒤로 옮긴 후 괄호를 지운다.
 * 스택을 이용한 후위표기법 변환 : 토큰이 없어질때 까지 넣었다가 뺏다를 반복 없어지면 다 뽑아 종료
 * 피연산자는 출력한다 → 연산자는 앞 연산자(스택의 맨 위)를 살펴서 출력하거나 대기한다
 * → 스택에 넣는다, 대기 된 자료들은 나중에 대기 된 연산자가 먼저 나온다, LIFO, 스택을 이용)
 * → 연산자의 대기(스택에 push)여부는 연산자간의 우선순위에 따른다
 * * 괄호가 있는경우
 * 왼쪽괄호 – 무조건 스택에 넣는다 → 오른쪽 괄호의 처리 – 왼쪽 괄호가 나올 때까지 스택에서 pop 한다.
 *
 */


public class BasicTest {
    static Map<Character, Integer> priorityRule = new HashMap<>();
    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {
        String input = "A+B*C+(D+F)/E";     //  ABC *+ DF+ E/+
        //String input = "A+B*C+D+F/E";        //  ABC *+ D + FE/+
        //아무것도 없는 상태

        //수식의 우선순위
        priorityRule.put('(', 3);
        priorityRule.put(')', 3);
        priorityRule.put('*', 1);
        priorityRule.put('/', 1);
        priorityRule.put('+', 2);
        priorityRule.put('-', 2);

        System.out.println(combie(input));
    }

    //괄호 안에 괄호를 확인하자
    private static String combie(String input){
        String resultStr = "";
        for (int i = 0; i < input.length(); i++) {
            //수식과 변수 구분해서 넣어주는 작업
            if (input.charAt(i) == '*' ||input.charAt(i) == '/' || input.charAt(i) == '+' || input.charAt(i) == '-'){
                // 이거 stack.top 값 확인해보고 넣을지 뺄지 확인하기
                try{
                    if (priorityRule.get(input.charAt(i)) < priorityRule.get(stack.peek())){
                        stack.push(input.charAt(i));
                    }else{
                        while (!stack.empty()){
                            resultStr = resultStr + stack.pop();
                        }
                        stack.push(input.charAt(i));
                    }
                }catch (EmptyStackException e){
                    stack.push(input.charAt(i));
                }
             //괄호는 특수하게 관리
            }else if (input.charAt(i) == '('){
                stack.push(input.charAt(i));
            }else if (input.charAt(i) == ')'){
                System.out.println(resultStr);
                while (priorityRule.get(input.charAt(i)) != priorityRule.get(stack.peek())){
                    resultStr = resultStr + stack.pop();
                }
                stack.pop();
            }else{
                resultStr = resultStr + input.charAt(i);
            }
        }
        //최종 남은 것들 모조리 넣어주기
        while (!stack.empty()){
            resultStr = resultStr + stack.pop();
        }
        return resultStr;
    }
}
