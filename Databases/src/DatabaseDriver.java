import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DatabaseDriver {

	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
        Statement stat = conn.createStatement();
        
        // table creations
        stat.executeUpdate("drop table if exists users;");
        stat.executeUpdate("create table users (nickname unique, eMail, password);");
        stat.executeUpdate("drop table if exists messages;");
        stat.executeUpdate("create table messages (id, nickname, message);");
        stat.executeUpdate("drop table if exists friends;");
        stat.executeUpdate("create table friends (nickname1, nickname2, primary key(nickname1, nickname2));");
        
        // initialize preps
        PreparedStatement prep = conn.prepareStatement(
            "insert into users values (?, ?, ?);");
        PreparedStatement say = conn.prepareStatement(
        		"insert into messages values (?, ?, ?);");
        PreparedStatement pair = conn.prepareStatement(
        		"insert into friends values (?, ?);");
        
        // user input
        prep.setString(1, "Hiyeon");
        prep.setString(2, "hiyeon@mail.com");
        prep.setString(3, "pw1");
        prep.addBatch();
        prep.setString(1, "Juan");
        prep.setString(2, "juan@mail.com");
        prep.setString(3, "pw2");
        prep.addBatch();
        prep.setString(1, "Nathalie");
        prep.setString(2, "nathalie@mail.com");
        prep.setString(3, "pw3");
        prep.addBatch();
        prep.setString(1,  "Eva");
        prep.setString(2,  "eva@mail.com");
        prep.setString(3, "pw4");
        prep.addBatch();

        conn.setAutoCommit(false);
        prep.executeBatch();
        conn.setAutoCommit(true);

        // friends input
        pair.setString(1,  "Juan");
        pair.setString(2, "Hiyeon");
        pair.addBatch();
        pair.setString(1,  "Hiyeon");
        pair.setString(2, "Juan");
        pair.addBatch();
        pair.setString(1,  "Hiyeon");
        pair.setString(2,  "Nathalie");
        pair.addBatch();
        pair.setString(1,  "Nathalie");
        pair.setString(2, "Hiyeon");
        pair.addBatch();
        pair.setString(1, "Eva");
        pair.setString(2, "Hiyeon");
        pair.addBatch();
        pair.setString(1,  "Hiyeon");
        pair.setString(2,  "Eva");
        pair.addBatch();
        
        conn.setAutoCommit(false);
        pair.executeBatch();
        conn.setAutoCommit(true);
        
        // messages input

        int MsgNum = 0;
        
        say.setInt(1, ++MsgNum);
        say.setString(2, "Hiyeon");
        say.setString(3, "Hi Everyone");
        say.addBatch();
        
        say.setInt(1, ++MsgNum);
        say.setString(2, "Nathalie");
        say.setString(3, "No one coming?");
        say.addBatch();

        say.setInt(1, ++MsgNum);
        say.setString(2, "Hiyeon");
        say.setString(3, "Hi Everyone2");
        say.addBatch();
        
        say.setInt(1, ++MsgNum);
        say.setString(2, "Hiyeon");
        say.setString(3, "Hi Everyone3");
        say.addBatch();
        
        say.setInt(1, ++MsgNum);
        say.setString(2, "Juan");
        say.setString(3, "Coming");
        say.addBatch();
        
        say.setInt(1, ++MsgNum);
        say.setString(2, "Hiyeon");
        say.setString(3, "Hi Everyone4");
        say.addBatch();
        
        say.setInt(1, ++MsgNum);
        say.setString(2, "Eva");
        say.setString(3, "Not coming");
        say.addBatch();
        
        say.setInt(1, ++MsgNum);
        say.setString(2, "Eva");
        say.setString(3, "Sorry");
        say.addBatch();
        
        say.setInt(1, ++MsgNum);
        say.setString(2, "Hiyeon");
        say.setString(3, "Hi Everyone5");
        say.addBatch();
        
        say.setInt(1, ++MsgNum);
        say.setString(2, "Hiyeon");
        say.setString(3, "Hi Everyone6");
        say.addBatch();
        
        conn.setAutoCommit(false);
        say.executeBatch();
        conn.setAutoCommit(true);
        
        
        // test
        DatabaseHelper helper = new DatabaseHelper();
        helper.printAllUsers(stat);
        helper.printFiveMsg(stat, "Hiyeon");
        helper.printThreeMsg(stat, "Hiyeon");
      
        conn.close();
	}
	//todo: test your methods from the DatabaseHelper-class here and print the results
	//note: comment out the whole main-Method of Example.java. Otherwise Eclipse will not compile
	//as there are two main methods

}
