package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.connection.JavaConnection;
import com.app.exception.BusinessException;
import com.app.impl.Dao;
import com.app.model.Players;


public class DaoImplimentation implements Dao{
	@Override
	public List<Players> getAllPlayers() throws BusinessException {
		List<Players> playersList = new ArrayList<>();
		try(Connection connection= JavaConnection.getConnection()){
			
			String sql= "select * from players";
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			ResultSet resultset = preparedstatement.executeQuery(sql);
			while(resultset.next()) {
				Players players = new Players();
				players.setId(resultset.getInt("id"));
				players.setName(resultset.getString("name"));
				players.setAge(resultset.getInt("age"));
				players.setCity(resultset.getString("city"));
				players.setGender(resultset.getString("gender"));
				players.setSportsName(resultset.getString("sportsName"));
				players.setContact(resultset.getLong("contact"));
				playersList.add(players);
				}
			//playersList.stream().forEach(System.out::println);
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			throw new BusinessException("Internal error occured, please contact suport");
		}
		
		return playersList;
	}

	@Override
	public int createPlayers(Players players) {
		int c=0;
		try(Connection connection= JavaConnection.getConnection()){
			String sql="insert into players(id,name,age,city,gender,sportsname,contact) values(? ,? ,? ,? ,? ,? ,?)";
			PreparedStatement preparedStatement =connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, players.getId());
			preparedStatement.setString(2, players.getName());
			preparedStatement.setInt(3, players.getAge());
			preparedStatement.setString(4, players.getCity());
			preparedStatement.setString(5, players.getGender());
			preparedStatement.setString(6, players.getSportsName());
			preparedStatement.setLong(7, players.getContact());
			c=preparedStatement.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		} 
		return c;
	}

	@Override
	public int updatePlayers(int id, long contact) {
		// TODO Auto-generated method stub
		int c=0;
		try(Connection connection = JavaConnection.getConnection()){
			String sql="update players set contact=? where id=?";
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setLong(1, contact);
			preparedstatement.setInt(2, id);
			c=preparedstatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public int deletePlayers(int id) {
		try(Connection connection = JavaConnection.getConnection()){
			int c=0;
			String sql=" Delete from players where id= ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			c=preparedStatement.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	

}
