package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
public Main() {
Employee emp=new Employee("rk", "101", "Fs");
System.out.println("Writing object started");
ObjectOutputStream oos;
try {
  oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\rkurisetti\\Desktop\\test")));
  oos.writeObject(emp);
} catch (IOException e1) {
  // TODO Auto-generated catch block
  e1.printStackTrace();
}
System.out.println("Writing object complete");

}
}
