package observerpractice;

import java.util.Random;

public class WeatherMachine {
  public double temparature;
  public double humidity;

  public WeatherMachine() {
    new Thread(()->{
      while(true) {
        try {
        Thread.sleep(10000);
        temparature=new Random(100).nextDouble();
        humidity=new Random(100).nextDouble();
        }catch(Exception e) {
          
        }
      }
    }).start(); 
  }
}