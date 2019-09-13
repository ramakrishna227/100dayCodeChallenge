
public class Child1 implements Parent {

  public <T> T method1(T num) {
    return num;
  }

  
  public static void main(String[] args) {
    int i=100;
    Child1 obj=new Child1();
    System.out.println(obj.method1(i));
  }

}
