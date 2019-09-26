package jmx_mbean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game implements GameMBean {
  private String playerName;

  public void playCricket(String teamName) {
    System.out.println(playerName + " is playing for " + teamName);
  }

  public String getPlayerName() {
    System.out.println("Player Name is " + playerName);
    return playerName;

  }

  public void setPlayerName(String playerName) {
    System.out.println("Set playerName to value " + playerName);
    this.playerName = playerName;
  }

  @Override
  public String getCoach() {
    System.out.println("Current coach is Stephen Fleming"); 
    return "Stephen Fleming";
  }

  @Override
  public boolean areTicketsAvailable() {
    System.out.println("Tickets available ");
    return true;
  }

  
  @Override
  public List<String> getMedia() {
    return Arrays.asList("print","electronic", "internet");
  }
  
  @Override
  public Map<String,String> getPlayerPrice(){
    Map<String, String> playerPriceMap=new HashMap<>();
    playerPriceMap.put("Dhoni", "15 Crore");
    playerPriceMap.put("Raina", "11 Crore");
    return playerPriceMap;
  }
  
}
