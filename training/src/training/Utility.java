package training;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Ashish Patel
 */
public class Utility {

    public static String printDateTimeNow() {
        Calendar calendar = Calendar.getInstance();
        Long timeInMillis = calendar.getTimeInMillis();
        Date date = new Date();
        date.setTime(timeInMillis);
        String formattedDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
        return formattedDate;
    }
}
