package officePractice;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerProblem {
  BlockingQueue queue = new LinkedBlockingQueue(3);

  public static void main(String[] args) {
    ProducerConsumerProblem pcp = new ProducerConsumerProblem();
    Thread pt = new Thread(new Runnable() {

      @Override
      public void run() {
        pcp.produce();
      }
    });

    Thread ct = new Thread(new Runnable() {

      @Override
      public void run() {
        pcp.consume();
      }
    });

    ct.start();
    pt.start();

    try {
      ct.join();
    } catch (InterruptedException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    try {
      pt.join();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void produce() {

    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep((long) (new Random().nextInt(5000)));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      try {
        queue.put(new Random().nextInt(100));
      } catch (InterruptedException e) {
      }
      System.out.println("Producer produced " + queue.peek());
    }
  }

  public void consume() {
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep((long) (new Random().nextInt(5000)));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      try {
        Integer item = (Integer) queue.take();
        System.out.println("Consumer consumed item " + item);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

    }
  }
}
