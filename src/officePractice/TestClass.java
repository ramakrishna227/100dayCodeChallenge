

import java.time.ZoneId;
import java.util.TimeZone;

import com.portware.utils.snapmarketdata.properties.SnapConfigConstants;

public class TestClass {
public static void main(String[] args) {
  TimeZone timeZone=SnapConfigConstants.getTimeZone("Asia/Calcutta");
System.out.println(timeZone.getID());  

timeZone=SnapConfigConstants.getTimeZone("India Standard Time - IST");
System.out.println(timeZone.getID());  

timeZone=SnapConfigConstants.getTimeZone("IST");
System.out.println(timeZone.getID());  


timeZone=SnapConfigConstants.getTimeZone("Hong Kong Time - Hongkong");
System.out.println(timeZone.getID());

timeZone=SnapConfigConstants.getTimeZone("Hongkong");
System.out.println(timeZone.getID());

System.out.println(TimeZone.getTimeZone("Asia/Calcutta").getID());
System.out.println(TimeZone.getTimeZone("India Standard Time - IST").getID());
System.out.println(TimeZone.getTimeZone("IST").getID());
System.out.println(TimeZone.getTimeZone("Hong Kong Time - Hongkong").getID());
System.out.println(TimeZone.getTimeZone("Hongkong").getID());


/*ZoneId zoneId=ZoneId.of("India Standard Time");
System.out.println(zoneId.getId());*/
}
}
