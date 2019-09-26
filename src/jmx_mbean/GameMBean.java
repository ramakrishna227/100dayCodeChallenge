package jmx_mbean;

import java.util.List;
import java.util.Map;

public interface GameMBean {
  public void playCricket(String teamName);

  public String getPlayerName();

  public void setPlayerName(String playerName);
  
  public String getCoach(); 
  
  public boolean areTicketsAvailable();
  
  public List<String> getMedia();
  
  public Map<String,String> getPlayerPrice();
}
