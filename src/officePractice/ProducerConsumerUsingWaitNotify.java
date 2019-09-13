package officePractice;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ProducerConsumerUsingWaitNotify {
  LinkedList<Integer> myList = new LinkedList<>();
  int size = 3;

  public static void main(String[] args) {
    ProducerConsumerUsingWaitNotify obj=new ProducerConsumerUsingWaitNotify();
    
    Thread producerThread=new Thread(new Runnable() {
      
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          try {
            Thread.sleep((long) (new Random().nextInt(5000)));
           obj.produce();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        
      }
    });

    
    Thread consumerThread=new Thread(new Runnable() {
      
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          try {
            Thread.sleep((long) (new Random().nextInt(5000)));
            obj.consume();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        
      }
    });
    
    producerThread.start();
    consumerThread.start();
    
    try {
      producerThread.join();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try {
      consumerThread.join();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void produce() {
    synchronized (myList) {
      if (myList.size() == size) {
        try {
          myList.wait();
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      myList.add(new Random().nextInt(100));
      System.out.println("Value produced is "+myList.peekLast());
      myList.notifyAll();
    }
  }
  
  public void consume() {
    synchronized(myList) {
      if(myList.size()==0) {
        try {
          myList.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      Integer removeFirst = myList.removeFirst();
      System.out.println("Value consumed is "+removeFirst);
      myList.notifyAll();
    }
  }

}
