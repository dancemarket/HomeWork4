package homework1220_findPassword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 205-121 on 2016-12-20.
 */

/**
 * 재귀를 짜는 쉬운방법은
 * 1. 아래로 내려가는 방법을 짜.(전체를 돌수 있는 방법을 찾아)
 * 2. 예외를 찾아 .. 간단한거부터
 *      - 1번 예외는 입력 데이터가 없다.
 *      - 2번 예외는 더 이상 리프 데이터가 없다
 *      - 논리 예외를 찾아. 중복체크라든지, 4개 까지만 찾는다든지
 * @param
 */
public class FindMain {
    static Scanner scan = new Scanner(System.in);

    public static int totalChar = scan.nextInt();
    public static int passwordLength = scan.nextInt();

    public static void main(String[] args) {
        String[] getChar = new String[totalChar];
        //예상되는 문자 입력 받기
        for (int i = 0; i < totalChar; i++) {
            getChar[i] = scan.next();
        }
        Arrays.sort(getChar);

        List<String> password = new ArrayList<>();
        for (int index = 0; index < getChar.length; index++) {
            find(getChar[index], getChar, password);
        }
    }

    private static void find(String data, String[] getChar, List<String> password) {
        List<String> copyPassword = new ArrayList<>(password);

        //현재 위치 찾기
        int index = 0;
        for (int j = 0; j < getChar.length; j++) {
            if(data.equals(getChar[j])){
                index = j;
            }
        }


        //추가 해봤자 암호 설정 갯수 이하면 종료
        if ((copyPassword.size() + getChar.length - index) < passwordLength){
            return;
        }


        copyPassword.add(getChar[index]);

        /*if (copyPassword.size() == passwordLength) {
            System.out.println(copyPassword);
            return;
        }*/

        List<String> vowelCheck = new ArrayList<>();
        vowelCheck.add("a");
        vowelCheck.add("o");
        vowelCheck.add("u");
        vowelCheck.add("e");
        vowelCheck.add("i");
        //자음, 모음 갯수 검사
        if (copyPassword.size() == passwordLength){
            int vowel = 0;
            int consonant = 0;
            for (int i = 0; i < passwordLength; i++) {
                if (vowelCheck.contains(copyPassword.get(i))){
                    vowel++;
                }else{
                    consonant++;
                }
            }
            if (vowel >=1 && consonant >=2){
                    System.out.println(copyPassword);
                    return;
                }else {
                    return;
                }

        }

        for (int i = index; i < getChar.length; i++) {
            if (i+1 >= getChar.length){
                continue;
            }
            find(getChar[i+1], getChar, copyPassword);
        }
    }
}
