package homework1220_findPassword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 205-121 on 2016-12-20.
 */
public class FindPassword {
    Scanner scan = new Scanner(System.in);


    public void passwordFind(){
        int L = scan.nextInt();
        int C = scan.nextInt();

        passwordMake(L, C);

    }

    public void passwordMake(int L, int C){
        //예상되는 알파벳 종류 입력 받고 그걸 정렬
        String[] getChar = new String[C];
        for (int i = 0; i < C; i++) {
            getChar[i] = scan.next();
        }
        Arrays.sort(getChar);

        for (int i = 0; i <= C-L ; i++) {
            //맨 뒤 문자열 부터 작성 및 저장 할 예정
            for (int j = 0; j < 5; j++) {
                //for문 돌때 마다 임시 문자열 생성 후 맨 앞에 문자 지정
                String tempPassword = getChar[i];
                
            }
        }
    }
}
