import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;


/**
 * To make only 4 threads run at any instance of time trying with semaphore
 * @author rkurisetti
 *
 */
public class NThreadsAtAnyPointOfTime {
  static Semaphore s=new Semaphore(4);

  public static void main(String[] args) {

    ExecutorService es = Executors.newFixedThreadPool(10, new ThreadFactory() {
      int i = 0;
      @Override
      public Thread newThread(Runnable r) {
        Thread th = new Thread(r, "MyThread" + i);
        i++;
        return th;
      }
    });
  
    for(int i=0; i<100; i++) {
      es.execute(new MyTask(s));
    }
    
    es.shutdown();
  }
  
}
class MyTask implements Runnable {
Semaphore s;  
  public MyTask(Semaphore s) {
    this.s=s;
  }
  @Override
  public void run() {
    try {
      s.acquire();
    } catch (InterruptedException e1) {
      e1.printStackTrace();
    }
    System.out.println("Running this task in thread " + Thread.currentThread().getName());
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      s.release();
  }
}