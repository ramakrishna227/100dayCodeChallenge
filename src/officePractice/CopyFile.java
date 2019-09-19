package officePractice;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyFile {
public static void main(String[] args) throws IOException {
  for(int i=0; i<100; i++) {
  BufferedWriter br=new BufferedWriter(new FileWriter(new File("C:\\Portware\\data\\logs\\server\\BS20190919031109.log"), true));
  
  Files.lines(Paths.get("C:\\\\Portware\\\\data\\\\logs\\\\server\\\\BS20190918052805.log")).forEach(line->{
    try {
      br.write(line);
    } catch (IOException e) {
      e.printStackTrace();
    }
  });
  
  br.flush();
  br.close();
  System.out.println("Writing complete");
  }
}
}
