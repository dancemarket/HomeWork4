package homework1218_countDay;

/**
 * Created by dhgof_000 on 2016-12-18.
 */
public class CountDayMain {

    public static void main(String[] args) {
        CountDayWork cdw = new CountDayWork();
        CountDayWorkHighGrade cdwhg = new CountDayWorkHighGrade();

        int day = cdw.calenderCount("2016-12-5", "2015-11-31");
        System.out.println(day + "일전");

        String dayCount = cdwhg.calenderCount("2016-11-16", "2016-10-16");
        System.out.println(dayCount);

        //String to Integer 화
        /*
        String wholeDate = "2016-12-5";
        String[] date = wholeDate.split("-");
        int year = Integer.parseInt(date[0]);
        System.out.println(year);
        */
    }


}
