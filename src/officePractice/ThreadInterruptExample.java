import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadInterruptExample {
public static void main(String[] args) throws InterruptedException {
  ScheduledExecutorService es=Executors.newScheduledThreadPool(1);
  
  ExecutorService es1=Executors.newFixedThreadPool(10);
  es1.submit(()->System.out.println("hello"));
  
  
  Thread th=new Thread(()->{
    
    
    
    
while(!Thread.currentThread().isInterrupted()) {
  System.out.println("I am a db op takes 10min");
    }
    
    
  })  ;
  
  th.start();
  Thread.sleep(3000);
 
  th.interrupt();
  
}
}
