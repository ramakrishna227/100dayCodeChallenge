package officePractice;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Java8FilesAPI {
public static void main(String[] args) {
  try {
    Stream<String> stream = Files.lines(Paths.get("C:\\Users\\rkurisetti\\eclipse-workspace\\photon\\7.0\\Practice\\java\\CustomThreadPool.java"));
    stream.forEach(line->{
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      
      System.out.println(line);
    });
  } catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
}
}
