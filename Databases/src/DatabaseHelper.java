import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseHelper {

	public void printAllUsers(Statement stat) {
		try {
			ResultSet rs = stat.executeQuery("select nickname from users");
			System.out.println("*** All Users ***");
			while(rs.next()) {
				System.out.println(rs.getString("nickname"));
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printFiveMsg(Statement stat, String user) {
		try {
			ResultSet rs = stat.executeQuery("SELECT message FROM messages WHERE nickname = \"" + user + "\" ORDER BY id DESC");
			System.out.println("\n*** Recent 5 Messages : " + user + " ***");
			int i = 0;
			while(rs.next() && i < 5) {
				System.out.println(rs.getString("message"));
				i++;
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void printThreeMsg(Statement stat, String user) {
		try {
			ResultSet rs = stat.executeQuery("SELECT nickname2 FROM friends WHERE nickname1 = \"" + user + "\"");
			System.out.println("\n*** Recent Three Messages from Frineds : " + user + " ***");
			
			// Get the list of all friends
			ArrayList<String> friendlist = new ArrayList<String>();
			while(rs.next())
				friendlist.add(rs.getString("nickname2"));
			if(friendlist.isEmpty() == true)
				System.out.println("NO FRIENDS");
			
			// Get the message list
			ResultSet rs2 = stat.executeQuery("SELECT * FROM messages ORDER BY id DESC");
			int i = 0;
			while(rs2.next() && i < 3) {
				String person = rs2.getString("nickname");
				if(friendlist.contains(person)) {
					System.out.println(person + ": " + rs2.getString("message"));
					i++;
				}
			}
			rs.close();
			rs2.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//todo: You want to create a social network.
	//For that you need a database which has the following properties:
	//- create a table for 'Users'
	//	-> each user has to have a unique nickname, an eMail adress and a password
	//	-> users can post messages which are visible to everyone
	//- two users can be friends. create a table 'Friends'
	//Add the following methods to your DatabaseHelper class:
	//- get all Nicknames from users
	//- get the last 5 posted messages from a selected user
	//- get the last 3 posted messages of all friends of one user

}
