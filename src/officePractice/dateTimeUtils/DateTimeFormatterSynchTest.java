package dateTimeUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DateTimeFormatterSynchTest {
  private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
  
  static DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

  static String pattern = "MMddyyyyss SSS";
  static SimpleDateFormat sdf = new SimpleDateFormat(pattern);

  public static void main(String[] args) {

    
    Thread th1 = new Thread(new Runnable() {

      public void run() {
        for (int i = 0; i < 100; i++) {
          try {
            Date date = new Date();
            System.out.println(Thread.currentThread().getName() + "  -  " + sdf.format(date));
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      }
    });

    Thread th2 = new Thread(new Runnable() {

      public void run() {
        for (int i = 0; i < 100; i++) {
          try {
            Date date = new Date();
            System.out.println(Thread.currentThread().getName() + "  -  " + sdf.format(date));
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      }
    });

//    th1.start();
//    th2.start();

    ExecutorService executorService = Executors.newFixedThreadPool(10);

    Runnable sharedTask = new Runnable() {

      public void run() {
        try {
          String dateStr = "2018-06-22T10:00:00";
          LocalDate date = LocalDate.parse(dateStr, formatter);
          System.out.println(Thread.currentThread().getName() + "  -  "+"Successfully Parsed Date " + date);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }

    };

    for (int i = 0; i < 100; i++) {
      executorService.submit(sharedTask);
    }

    executorService.shutdown();

  }

}
