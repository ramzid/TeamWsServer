package training.ws.TeamWsServer;
/***
 * 
 * @author ramzi dridi
 *
 */
public class Player {
private String name;
private String nickName;

public Player() {
	// TODO Auto-generated constructor stub
}

public Player(String name, String nickName) {
	
	this.name = name;
	this.nickName = nickName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNickName() {
	return nickName;
}
public void setNickName(String nickName) {
	this.nickName = nickName;
}
}
