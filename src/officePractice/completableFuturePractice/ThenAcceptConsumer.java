package officePractice.completableFuturePractice;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ThenAcceptConsumer {
public static void main(String[] args) {
  CompletableFuture<Void> cf=CompletableFuture.completedFuture("hello")
                                                .thenAccept(System.out::println);
}
}
