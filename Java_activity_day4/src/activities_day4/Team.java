package activities_day4;

import java.util.*;



public class Team implements Comparable<Team> {
	String name;
    List<Player> playerList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public List<Player> getPlayerList() {
        Collections.sort(playerList);
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
    
    

    public Team(String name) {
        this.name = name;
    }

    void addPlayer(String name) {
        playerList.add(new Player(name));
    }

    @Override
    public int compareTo(Team o) {
        return this.name.compareTo(o.getName());
    }

	
}