package officePractice.observerpractice;

import java.util.ArrayList;
import java.util.List;

public interface Observable {
  List<Observer> observers=new ArrayList<>();
public void register(Observer observer);
public void unregister(Observer observer);

}
