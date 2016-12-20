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
        String[] lChar = new String[L];
    }
}
