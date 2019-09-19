package ioPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomAccessCRUD {
  public static void main(String[] args) {
    RandomAccessCRUD randomAccessCRUD = new RandomAccessCRUD();
    //randomAccessCRUD.createData();
    randomAccessCRUD.displayData();
  }

  private void createData() {
    File file = new File("C:\\Users\\rkurisetti\\Desktop\\test\\phoneBook.txt");
    if (!file.exists()) {
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
    try {
      RandomAccessFile raf=new RandomAccessFile(file, "rw");
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter name and number in 'Name!Number' format");
      String nextLine = sc.nextLine();;
      while(!nextLine.equals("esc")) {
        int specialCharIndex = nextLine.indexOf('!');
        String name=nextLine.substring(0,specialCharIndex);
        Long number=Long.parseLong(nextLine.substring(specialCharIndex+1));
        try {
          raf.writeBytes(name+" - "+number);
          raf.writeBytes(System.lineSeparator());
        } catch (IOException e) {
          e.printStackTrace();
        }
        nextLine=sc.nextLine();
      }
      
      
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    
  }
  
  private void displayData() {
File file=new File("C:\\Users\\rkurisetti\\Desktop\\test\\phoneBook.txt");
if(!file.exists()) {
  System.out.println("File not exist, returning");
  return;
}
System.out.println("File found, Printing data..");
try {
  RandomAccessFile raf=new RandomAccessFile(file, "r");
  try {
    String str=raf.readLine();
    while(str!=null) {
      System.out.println(str);
      str=raf.readLine();
    }
  } catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
  
 
} catch (FileNotFoundException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
}
  }
}
