package officePractice.completableFuturePractice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class CompletableCancel {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executor = Executors.newSingleThreadExecutor(new ThreadFactory() {

      @Override
      public Thread newThread(Runnable r) {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        return new Thread(r);
      }
    });

    CompletableFuture<String> cf =
        CompletableFuture.completedFuture("hello").thenApplyAsync(String::toUpperCase, executor);
  
  
  CompletableFuture<String> exceptionally = cf.exceptionally(throwable->"cancelled");
  System.out.println(cf.cancel(true));
  System.out.println(cf.isCompletedExceptionally());
  System.out.println(exceptionally.join());
  System.out.println(exceptionally.get());
  System.out.println(cf.get());
  }
  
  
  
}
