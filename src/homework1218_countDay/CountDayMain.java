package homework1218_countDay;

/**
 * Created by dhgof_000 on 2016-12-18.
 */
public class CountDayMain {

    public static void main(String[] args) {
        CountDayWork cdw = new CountDayWork();

        int day = cdw.calenderCount(2016, 12,5, 2015, 11, 31);
        System.out.println(day);
    }


}
