package officePractice;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class MethodExecutionInOrderUsingCountDownLatch {
  CountDownLatch latch=new CountDownLatch(3);
  public void method1() {
    try {
      synchronized(this) {
        while(latch.getCount()!=3) {
          wait(1000);
        }
      wait(new Random().nextInt(10000));
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("1st");
    latch.countDown();
    notifyAll();
  }

  public void method2() {
    try {
      synchronized(this) {
        while(latch.getCount()!=2) {
          wait(1000);
        }
        wait(new Random().nextInt(10000));
        }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    System.out.println("2nd");
    latch.countDown();
    notifyAll();
  }

  public void method3() {
    try {
      synchronized(this) {
        while(latch.getCount()!=1) {
          wait(1000);
        }
        wait(new Random().nextInt(10000));
        
        }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("3rd");
    latch.countDown();
    notifyAll();
  }
  public void method4() {
    try {
      synchronized(this) {
        while(latch.getCount()!=0) {
          wait(1000);
        }
        wait(new Random().nextInt(10000));
        }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("4th");
    latch.countDown();
    notifyAll();
  }
  Thread th1=new Thread(new Runnable() {
    
    @Override
    public void run() {
      System.out.println("th1");
      method1();
      
    }
  });

  Thread th2=new Thread(new Runnable() {
    
    @Override
    public void run() {
      System.out.println("th2");
      method2();
      
    }
  });

  Thread th3=new Thread(new Runnable() {
    
    @Override
    public void run() {
      System.out.println("th3");
      method3();
      
    }
  });

  Thread th4=new Thread(new Runnable() {
    
    @Override
    public void run() {
      System.out.println("th4");
      method4();
      
    }
  });

  public static void main(String[] args) {
    MethodExecutionInOrderSemaphore obj=new MethodExecutionInOrderSemaphore();
    obj.th1.start();
    obj.th2.start();
    obj.th3.start();
    obj.th4.start();
  }
}
