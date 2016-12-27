package homework1220_findPassword;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 205-121 on 2016-12-20.
 */
public class findMain {
    public static void main(String[] args) {
        //문자를 제대로 입력 받는가
        Scanner scan = new Scanner(System.in);
        String[] getChar = new String[6];
        //예상되는 문자 입력 받기
        for (int i = 0; i < 6; i++) {
            getChar[i] = scan.next();
        }
        Arrays.sort(getChar);
        System.out.println(Arrays.toString(getChar));
    /*
        findPassword fp = new findPassword();

        System.out.println(fp.passwordFind());
     */
    }
}
