package homework1212_snailGo;

/**
 * Created by 205-121 on 2016-12-13.
 */
public class SnailGo {
    public int snailGo(int A, int B, int V){
        int day = (int)Math.ceil((double)(V-B)/(double)(A-B));
        return day;
    }
}
