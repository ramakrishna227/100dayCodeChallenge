package officePractice;
import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

      Scanner scanner=new Scanner(System.in);

int totalStudents=scanner.nextInt();
Set<Integer> presentSet=new HashSet<Integer>();
int input=0;
while(input<totalStudents) {
  int no=scanner.nextInt();
  presentSet.add(no);
  input++;
}

for(int i=1; i<=totalStudents;i++){
    if(!presentSet.contains(i))
    System.out.print(i+" ");
}


   }
}