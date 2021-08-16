package com.app.main;

import java.util.ArrayList;
import java.util.List;

import com.app.exception.BusinessException;
import com.app.impl.Dao;
import com.app.model.Players;
import com.dao.impl.DaoImplimentation;

public class PlayersMain {
	public static void main(String[] args) {
		Dao dao= new DaoImplimentation();
		//Players players = new Players(108, "Abcd", 30, "Ranchi", "M", "Cricket", 6666666666L);
		//String sql="insert into players(id,name,age,city,gender,sportsname,contact) values(? ? ? ? ? ? ?)";
		List<Players> playerslist = new ArrayList<>();
		int c,c1;
		try {
			
			playerslist=dao.getAllPlayers();
			playerslist.stream().forEach(System.out::println);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
//		
//		c=dao.createPlayers(players);
//		if(c==1) {
//			System.out.println("Values inserted ");
//			System.out.println(players);
//		}
//		else {
//			System.out.println("Values not inserted");
//		}
		
//		c=dao.updatePlayers(101, 5689745368L);
//		if(c==1) {
//			System.out.println("Values inserted ");
//
//		}
//		else {
//			System.out.println("not");
//		}
//		playerslist.stream().forEach(System.out::println);
		c1=dao.deletePlayers(104);
		if(c1==0) {
			System.out.println("Player deleted sucessfully");
		}
		else {
			System.out.println("not deleted");
		}
		playerslist.stream().forEach(System.out::println);

		
	}
}
