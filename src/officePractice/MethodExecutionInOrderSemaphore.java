import java.util.Random;
import java.util.concurrent.Semaphore;

public class MethodExecutionInOrderSemaphore {
  Semaphore s1=new Semaphore(0);
  Semaphore s2=new Semaphore(0);
  Semaphore s3=new Semaphore(0);
public void method1() {
  try {
    synchronized(this) {
    wait(new Random().nextInt(10000));
    }
  } catch (InterruptedException e) {
    e.printStackTrace();
  }
  System.out.println("1st");
  s1.release();
}

public void method2() {
  try {
    synchronized(this) {
      wait(new Random().nextInt(10000));
      }
    s1.acquire();
  } catch (InterruptedException e) {
    e.printStackTrace();
  }
  
  System.out.println("2nd");
  s2.release();
}

public void method3() {
  try {
    synchronized(this) {
      wait(new Random().nextInt(10000));
      
      }
    s2.acquire();
  } catch (InterruptedException e) {
    e.printStackTrace();
  }
  System.out.println("3rd");
  s3.release();
}
public void method4() {
  try {
    synchronized(this) {
      wait(new Random().nextInt(10000));
      }
    s3.acquire();
  } catch (InterruptedException e) {
    e.printStackTrace();
  }
  System.out.println("4th");
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
