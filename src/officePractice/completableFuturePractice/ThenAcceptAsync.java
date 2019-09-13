package completableFuturePractice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenAcceptAsync {
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    CompletableFuture<Void> cf =
        CompletableFuture.completedFuture("Hello").thenAcceptAsync(s -> sb.append(s.toUpperCase()));
    cf.get();
    System.out.println(sb.toString());
  }
}
