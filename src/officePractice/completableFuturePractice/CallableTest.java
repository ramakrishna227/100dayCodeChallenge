package officePractice.completableFuturePractice;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
  static ExecutorService singleThreadExecutor=Executors.newSingleThreadExecutor();
public static void main(String[] args) throws InterruptedException  {
  Future<Integer> future= singleThreadExecutor.submit(()->{
    System.out.println("In call method");
    Thread.sleep(5000);
  
    
    return 22/0;
  });
  Thread.sleep(1000);
  future.cancel(true);
  
  System.out.println("future.isDone() - "+future.isDone());
  future.cancel(true);
  
  
  try {
    
  System.out.println(future.get());
  }catch(ExecutionException e) {
    e.printStackTrace();
    Thread.sleep(3000);
    System.out.println("Throwable.getCause()");
    e.getCause().printStackTrace();
  }catch(CancellationException e) {
    e.printStackTrace();
  }
  System.out.println("future.isDone() - "+future.isDone());
}
}
