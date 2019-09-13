package officePractice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PrintLines {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    List<String> al = new ArrayList<>();
    String st=s.nextLine();
    while (st!=null && !st.isEmpty()) {
      al.add(st);
      st=s.nextLine();
    }
    Iterator<String> iterator = al.iterator();
    int i=1;
    while(iterator.hasNext()) {
      System.out.println(i+" "+iterator.next());
      i++;
    }
        

  }
}
