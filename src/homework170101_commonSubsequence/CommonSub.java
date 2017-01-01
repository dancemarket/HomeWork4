package homework170101_commonSubsequence;

import java.util.Scanner;

/**
 * Created by dhgof_000 on 2017-01-01.
 */
public class CommonSub {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstStr = scan.next();
        String secondStr = scan.next();
        String resultStr = "";
        
        for (int i = 0; i < secondStr.length(); i++) {
            if (firstStr.contains(Character.toString(secondStr.charAt(i)))){
                if (resultStr.contains(Character.toString(secondStr.charAt(i)))){
                }else{
                    resultStr = resultStr + secondStr.charAt(i);
                }
            }
        }
        System.out.println(resultStr.length());
    }
}
