import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPool {
static BlockingQueue<Runnable> taskQueue=new LinkedBlockingQueue<>();

public static void main(String[] args) throws InterruptedException {
  
  new Thread(new Runnable() {
    
    @Override
    public void run() {
      
      taskQueue.add(new Runnable() {
        
        @Override
        public void run() {
         System.out.println("helloooooo");
          
        }
      });
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
      
      taskQueue.add(new Runnable() {
        
        @Override
        public void run() {
         System.out.println("Haiiiii");
          
        }
      });
      
    }
  }).start();
  Runnable runnable=null;
  while((runnable = taskQueue.take())!=null) {
    runnable.run();
  }
}
}
