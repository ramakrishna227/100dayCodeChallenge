package officePractice;

public class TestProperCustomThreadPool {
  public static void main(String[] args) throws InterruptedException {
    ProperCustomThreadPool threadPool = new ProperCustomThreadPool(3, 4);

    for (int i = 0; i < 15; i++) {
      TestTask task = new TestTask(i);
      threadPool.submitTask(task);
    }

  }
}
