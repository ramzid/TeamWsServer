package training.ws.TeamWsServer;

import java.util.List;

public class Team {
public Team(String name, List<Player> players) {
		
		this.name = name;
		this.players = players;
	}
private String name;
private List<Player> players;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Player> getPlayers() {
	return players;
}
public void setPlayers(List<Player> players) {
	this.players = players;
}
public void setRosterCount(int n){
	
};
public int getRosterCount(){
	return (players==null)?  0: players.size();
}
}
