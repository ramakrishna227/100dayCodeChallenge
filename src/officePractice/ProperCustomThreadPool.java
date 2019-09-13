import java.util.LinkedList;
import java.util.Queue;

public class ProperCustomThreadPool {
  BlockingQueue<Runnable> runnableQueue;

  public ProperCustomThreadPool(int queueSize, int threads) {

    runnableQueue = new BlockingQueue<>(queueSize);
    String threadName = null;
    TaskExecutor task = null;

    for (int i = 0; i < threads; i++) {
      threadName = "Thread" + i;
      task = new TaskExecutor(runnableQueue);

      Thread thread = new Thread(task, threadName);
      thread.start();

    }
  }

  public void submitTask(Runnable runnable) throws InterruptedException {
    runnableQueue.enque(runnable);
  }
}

class TaskExecutor implements Runnable {
  BlockingQueue<Runnable> queue;

  public TaskExecutor(BlockingQueue<Runnable> queue) {
    this.queue = queue;

  }

  @Override
  public void run() {
    try {
      while (true) {
        String name = Thread.currentThread().getName();

        Runnable task = queue.dequeue();

        System.out.println("Task started by thread " + name);
        task.run();

        System.out.println("Task ended by thread " + name);
      }
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}

class BlockingQueue<Type> {
  Queue<Type> queue = new LinkedList<Type>();
  int EMPTY = 0;
  int MAX_TASKS = -1;

  public BlockingQueue(int size) {
    MAX_TASKS = size;
  }

  public synchronized void enque(Type task) throws InterruptedException {

    while (this.queue.size() == MAX_TASKS) {
      wait();
    }

    queue.offer(task);

    if (queue.size() > EMPTY) {
      notifyAll();
    }

  }

  public synchronized Type dequeue() throws InterruptedException {
    if (queue.size() == EMPTY) {
      wait();
    }
    Type task = queue.poll();
    notifyAll();

    return task;
  }
}

class TestTask implements Runnable {

  int number;

  public TestTask(int number) {
    this.number = number;
  }

  @Override
  public void run() {
    System.out.println("Executing task number " + number);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("Completed executing task number " + number);
  }

}