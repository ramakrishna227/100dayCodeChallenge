package completableFuturePractice;

import java.util.concurrent.CompletableFuture;

public class RunAsyncPractice{
  /**
   * Bydefault completeable future uses ForkJoinPool to execute async tasks submitted
   * 
   * FOrk join pool uses daemon threads to execute runnable task
   */
static void runAsyncExample() {
  CompletableFuture<Void> cf=CompletableFuture.runAsync(()->
  {
    System.out.println("isDaemon - "+Thread.currentThread().isDaemon());
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  });
  
  System.out.println("is Done - "+cf.isDone());
  
  try {
    Thread.sleep(11000);
  } catch (InterruptedException e) {
    e.printStackTrace();
  }
  System.out.println("isDone after sleep - "+cf.isDone());
  
  
}

public static void main(String[] args) {
  RunAsyncPractice.runAsyncExample();
}
}
