package completableFuturePractice;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureWIthThenApply {
  /**
   * we can use thenApplyAsync instead of thenApply to run the function on a new daemon thread as async future uses fork join pool by default
   * @param args
   */
  public static void main(String[] args) {
    CompletableFuture<String> cf = CompletableFuture.completedFuture("hello").thenApplyAsync(msg -> {
      System.out.println(
          "Thread name " + Thread.currentThread().getName() + ";  is daemon " + Thread.currentThread().isDaemon());
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println("Before return");
      return msg.toUpperCase();
    });

//    System.out.println(cf.getNow(null));
//    System.out.println(cf.join());
  }
}
