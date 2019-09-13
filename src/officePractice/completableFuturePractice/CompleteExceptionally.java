package completableFuturePractice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * 
 * @author rkurisetti
 *
 *Giving up on this example as the method delayedExecutor is added in java9 and is not present in java8
 */
public class CompleteExceptionally {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executor=Executors.newSingleThreadExecutor(new ThreadFactory() {
      
      @Override
      public Thread newThread(Runnable r) {
       try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
        return new Thread(r, "threadFactoryThread");
      }
    });
    CompletableFuture<Void> cf=CompletableFuture.completedFuture("hello").thenAcceptAsync(System.out::println,executor);
    cf.completeExceptionally(new RuntimeException("Complete Exceptionally"));
    CompletableFuture<Void> handle = cf.handle((s,th)->{
      System.out.println("String in handle is "+ s);
      String result = (th!=null?"exception":"noException");
      System.out.println(result);
      return null;
    });
    try {
      
      cf.join();
      
    }catch(Exception e) {
     e.printStackTrace(); 
    }
    
//   System.out.println( handle.join());;
  }
}
