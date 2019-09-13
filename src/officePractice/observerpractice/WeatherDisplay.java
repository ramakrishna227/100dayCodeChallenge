package observerpractice;

public class WeatherDisplay implements Observer {

  public WeatherDisplay(){
    
  }
  
  public static void main(String[] args) {
  }
  @Override
  public void update(double temp, double humidity) {
    System.out.println(temp);
    System.out.println(humidity);
  }

}
