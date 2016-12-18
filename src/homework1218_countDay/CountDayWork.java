package homework1218_countDay;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dhgof_000 on 2016-12-18.
 */
public class CountDayWork {

    public int calenderCount(int preYear, int preMon, int preDay, int pasYear, int pasMon, int pasDay){
        int present = calculateDay(preYear, preMon, preDay);
        int past = calculateDay(pasYear, pasMon, pasDay);
        return present - past;
    }
    public int calculateDay(int year, int mon, int day){
        int countDay = 0;
        countDay = year/4;
        countDay = countDay + (year * 365);

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (  int i = 1; i < mon; i++) {
            countDay += month[i];
        }
        countDay = countDay + day;
        return countDay;
    }
}
