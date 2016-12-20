package homework1220_findPassword;

import java.util.ArrayList;
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

        passwordMake(L, C);

    }

    public void passwordMake(int L, int C){
        String[] tempChar = new String[L];
        String[] getChar = new String[C];
        ArrayList<String> passwordList = new ArrayList<>();
        //예상되는 문자 입력 받기
        for (int i = 0; i < C; i++) {
            getChar[i] = scanCh.next();
        }
        //문자안에 자음2개 이상 모음 1개 이상 있는지 검증 -> 이건 tempChar에 넣어놓고 비교 해보자
        //비교하면서 카운트 하고, 카운트 한것이 충분하다면 ArrayList에 저장해주기

        //문자 하나씩 알파벳 순서 비교하면서 tempChar에 넣어주기
        for (int i = 0; i < C; i++) {
            tempChar[0] = getChar[i];
            for (int j = 1; j < L; j++) {
                tempChar[j] = getChar[i];
                for (int k = 1; k < ; k++) {

                }
            }

        }


    }
}
