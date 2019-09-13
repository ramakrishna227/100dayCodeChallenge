package completableFuturePractice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ApplyAsyncWIthExecutor {
  static ExecutorService executor = Executors.newFixedThreadPool(3, new ThreadFactory() {
    int count = 1;

    @Override
    public Thread newThread(Runnable runnable) {
      return new Thread(runnable, "custom_Executor_Thread_Factory-" + count++);
    }
  });

  

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    CompletableFuture<String> cf = CompletableFuture.completedFuture("hello").thenApplyAsync(s -> {
      System.out.println(Thread.currentThread().getName());
      System.out.println("is daemon check " + Thread.currentThread().isDaemon());
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Before return and after sleep");
      return s.toUpperCase();
    }, executor).thenApplyAsync(s->{
      System.out.println(Thread.currentThread().getName());
      System.out.println("is daemon check " + Thread.currentThread().isDaemon());
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Before return and after sleep of second thenApplyAsync");
    return s.toLowerCase();
    }, executor);
  
  System.out.println("is done "+cf.isDone());
  System.out.println(cf.get());
  }
  
  
}
