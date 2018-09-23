package training.ws.TeamWsServer;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Teams {
 private TeamsUtility utils;
 public Teams() {
	 utils=new TeamsUtility();
	 utils.make_test_teams();
	// TODO Auto-generated constructor stub
}
 
 @WebMethod
 public Team geTeam(String name){
	 return utils.getTeam(name);
 }
 @WebMethod
 public List<Team> geTeams(){
	 return utils.getTeams();
 }
}
