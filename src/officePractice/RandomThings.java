package officePractice;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class RandomThings {
public static void main(String[] args) {
 Set<Bean> mySet=new HashSet<>();
 mySet.add(new Bean(1,"a"));
 mySet.add(new Bean(2,"b"));
 mySet.add(new Bean(3,"c"));
 mySet.add(new Bean(4,"d"));
 Map<Integer, Bean> collect = mySet.stream().collect(Collectors.toMap(Bean::getKey, x->x));
 System.out.println("finish");
}
}
class Bean{
  int key;
  String val;
  
  
  public Bean(int key, String val) {
    this.key = key;
    this.val = val;
  }
  public int getKey() {
    return key;
  }
  public void setKey(int key) {
    this.key = key;
  }
  public String getVal() {
    return val;
  }
  public void setVal(String val) {
    this.val = val;
  }
  
  
}

class Bean1{
  public int getKey() {
    return new Random().nextInt(10);
  }
}