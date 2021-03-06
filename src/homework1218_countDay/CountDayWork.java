package homework1218_countDay;

import java.util.HashMap;
import java.util.Map;


/*
 * Created by dhgof_000 on 2016-12-18.
 */

public class CountDayWork {

    public int calenderCount(String present, String past){
        //넘어온 일자를 숫자로 변경들 해주시고
        String[] preDate = present.split("-");
        int preYear = Integer.parseInt(preDate[0]);
        int preMon = Integer.parseInt(preDate[1]);
        int preDay = Integer.parseInt(preDate[2]);
        String[] pasDate = past.split("-");
        int pasYear = Integer.parseInt(pasDate[0]);
        int pasMon = Integer.parseInt(pasDate[1]);
        int pasDay = Integer.parseInt(pasDate[2]);

        //함수 이용해서 변수에 총 날자들 계산해준걸 담아주고
        int presentDate = calculateDay(preYear, preMon, preDay);
        int pastDate = calculateDay(pasYear, pasMon, pasDay);
        return presentDate - pastDate;
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
