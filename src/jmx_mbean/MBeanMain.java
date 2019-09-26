package jmx_mbean;

import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

public class MBeanMain {
public static void main(String[] args) throws InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException, MalformedObjectNameException {
  MBeanServer mbs=ManagementFactory.getPlatformMBeanServer();
  Game game=new Game();
  game.setPlayerName("Dhoni");
  game.playCricket("CSK");
 
  
  ObjectName name=new ObjectName("test.SampleApplication:type=Game");
  
  mbs.registerMBean(game, name);
  
  while(true);
  
}
}
