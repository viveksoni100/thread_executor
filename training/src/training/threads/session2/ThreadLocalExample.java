package training.threads.session2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Ashish Patel
 */
public class ThreadLocalExample {

    private static ExecutorService executorService = Executors.newFixedThreadPool(10);
    static SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy-MM-dd");


    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
          executorService.submit( new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(printDateTimeNow());
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }));
        }

    }


    public static String printDateTimeNow() {
        Calendar calendar = Calendar.getInstance();
        Long timeInMillis = calendar.getTimeInMillis();
        Date date = new Date();
        date.setTime(timeInMillis);
        return ThreadSafeFormatter.dateFormatThreadLocal.get().format(date);
    }
}
