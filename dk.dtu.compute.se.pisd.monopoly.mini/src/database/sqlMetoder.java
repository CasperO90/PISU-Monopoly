package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import monopoly.mini.model.Game;
import monopoly.mini.model.Player;

public class sqlMetoder {
	
	
	private static final String Spiller_ID = "ID";
	
	private static final String Placering = "P";
	
	private static final String Navn = "N";
	
	private static final String beholdning = "Beholdning";
	
	private Connection conn;
	
	public sqlMetoder() {
		conn = Connector.getCon();
	}
	
	public void createPlayer(Player player) throws SQLException  {
		CallableStatement cp = conn.prepareCall("{call InsertToPlayers(?,?,?,?)}");
		System.out.println(player.getId());
		cp.setInt("ID", player.getId());
		cp.setInt("P", player.getCurrentPosition().getIndex());
		cp.setInt("Beholdning", player.getBalance());
		cp.setString("N",player.getName());
		cp.execute();	
	
		cp.close();
	}
	public void updatePlayer(Player player, Game game) throws SQLException  {
		CallableStatement cp = conn.prepareCall("{call UpdatePlayers(?,?,?)}");
			
		cp.setInt("P", player.getCurrentPosition().getIndex());
		cp.setInt("Beholdning", player.getBalance());
		cp.setInt("ID", player.getId());
		cp.executeQuery();
		
	/*	ResultSet rs = cp.executeQuery();
			while(rs.next()) {
			int ID = cp.getInt(Spiller_ID);
			player = game.getPlayers().get(ID);
			
			rs.updateInt(Placering, player.getCurrentPosition().getIndex());
			rs.updateInt(beholdning, player.getBalance());
			rs.updateRow();*/
//		}
	//	rs.close();
		cp.close();
	}
	public void deleteAllPlayerData () {
		try {
			CallableStatement cp = conn.prepareCall("{call deleteAllPlayerData()}");
			cp.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		
		
				
	
	
	
	
	
	
	


