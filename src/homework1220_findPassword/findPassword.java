package homework1220_findPassword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 205-121 on 2016-12-20.
 */
public class findPassword {
    Scanner scanNum = new Scanner(System.in);
    Scanner scanCh = new Scanner(System.in);


    public void passwordFind(){
        int L = scanNum.nextInt();
        int C = scanNum.nextInt();

        //return passwordMake(L, C);

    }

    public void passwordMake(int L, int C){
        //예상되는 알파벳 종류 입력 받고 그걸 정렬
        String[] getChar = new String[C];
        for (int i = 0; i < C; i++) {
            getChar[i] = scanCh.next();
        }
        Arrays.sort(getChar);
        //배열을 문자열로 바꿔줬고
        String getString = getChar.toString();

        //암호문자열의 맨 앞에 올 수 있는 경우 수 만큼 for문 돌려주기
        for (int i = C-L; i >= 0 ; i--) {
            //맨앞만 고정시키고 뒷열 for문 돌리기
            for (int j = 0; j < 5; j++) {
                //for문 돌때 마다 임시 문자열 생성 후 맨 앞에 문자 지정
                String tempPassword = getChar[i];
                
            }
        }
    }
}
