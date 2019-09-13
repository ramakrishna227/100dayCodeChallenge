package oracleQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OraclePractice {
  public static void main(String[] args) {
    String dbUrl = "jdbc:oracle:thin:@192.168.1.1:1521:PTS";
    String dbDriver = "oracle.jdbc.driver.OracleDriver";
    Connection con = null;
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.1:1521:PTS", "portware61", "powner501");
      Statement stmt = con.createStatement();

      //RK_EMPLOYEE(empId number(10), empName varchar2(50), salary number(20), dept number(20));
      String query = "insert into RK_EMPLOYEE values(101, 'ramakrishna', 85000, 'dev')";

      stmt.executeUpdate(query);

      System.out.println("record inserted");
    } catch (Exception e) {
      System.out.println("Alarm!! Exception1 occured");
      e.printStackTrace();
    } finally {
      if (con != null) {
        try {
          con.close();
        } catch (SQLException e) {
          System.out.println("Alarm!! Exception2 occured");
          e.printStackTrace();
          e.printStackTrace();
        }
      }
    }
  }
}
