package homework1212_snailGo;

import java.util.Scanner;

/**
 * Created by 205-121 on 2016-12-13.
 */
public class SnailMain {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        SnailGo sg = new SnailGo();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int V = scan.nextInt();

        System.out.println(sg.snailGo(A, B, V));
    }
}
