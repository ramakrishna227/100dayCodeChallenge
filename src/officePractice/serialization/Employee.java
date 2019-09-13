package serialization;

import java.io.Serializable;

public class Employee implements Serializable{
String name;
String id;
String office;
  private static final long serialVersionUID = 1L;
  
  
  public Employee() {
System.out.println("In employee default constructor");
  }


  public Employee(String name, String id, String office) {
    System.out.println("In employee constructor");
    this.name = name;
    this.id = id;
    this.office = office;
  }
  
  

}
