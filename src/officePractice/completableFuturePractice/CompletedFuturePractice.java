package completableFuturePractice;

//import static org.junit.Assert.assertTrue;

import java.util.concurrent.CompletableFuture;

public class CompletedFuturePractice {
  static void completableFutureExample() {
    CompletableFuture<String> cf = CompletableFuture.completedFuture("message");
    System.out.println(cf.isDone());
    System.out.println("message".equals(cf.getNow(null)));
  }

  public static void main(String[] args) {
    CompletedFuturePractice.completableFutureExample();
  }
}
