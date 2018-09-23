package training.ws.TeamWsServer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TeamsUtility {
private Map<String, Team> team_map;
public TeamsUtility() {
	team_map=new HashMap<String, Team>();
	// TODO Auto-generated constructor stub
}

public Team getTeam(String name){
	return team_map.get(name);
	
}
public Map<String, Team> getTeam_map() {
	return team_map;
}

public void setTeam_map(Map<String, Team> team_map) {
	this.team_map = team_map;
}


public List<Team> getTeams() {
	 List<Team> list = new ArrayList<Team>();
	 Set<String> keys = team_map.keySet();
	 for (String key : keys)
	 list.add(team_map.get(key));
	 return list;
	 }

private void store_teams(List<Team> teams) {
	 for (Team team : teams)
	 team_map.put(team.getName(), team);
	 }

public void  make_test_teams(){
	Player player1=new Player("ramzi","dridi");
	Player player2=new Player("khalil", "saad");

	Player player3=new Player("hamdi", "nabli");
	List<Player> listp=new ArrayList<Player>();
	listp.add(player1);
	listp.add(player2);
	listp.add(player3);
	Team team=new Team("team1",listp);
	List<Team> teams=new ArrayList<Team>();
	teams.add(team);
	
	store_teams(teams);
}
}
