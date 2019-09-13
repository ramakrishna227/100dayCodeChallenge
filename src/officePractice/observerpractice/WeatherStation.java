package observerpractice;

import java.util.Random;

public class WeatherStation implements Observable{
  public double temparature;
  public double humidity;

  public static void main(String[] args) {
  WeatherStation weatherStation=new WeatherStation();
  WeatherMachine machine = new WeatherMachine();
}

private void setValues(double temperature, double humidity) {
 this.temparature=temperature;
 this.humidity=humidity;
 
 updateObservers();
}





private void updateObservers() {
 observers.forEach(x-> x.update(temparature, humidity));
  
}

@Override
public void register(Observer observer) {
 if(!observers.contains(observer)) {
   observers.add(observer);
 }
  
}


@Override
public void unregister(Observer observer) {
  if(observers.contains(observer)) {
    observers.remove(observer);
  }
}
}
