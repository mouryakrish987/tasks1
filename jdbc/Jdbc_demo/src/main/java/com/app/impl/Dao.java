package com.app.impl;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Players;

public interface Dao {
		public List<Players> getAllPlayers() throws BusinessException;
		public int createPlayers(Players players);
		
		public int updatePlayers(int id, long contact);
		public int deletePlayers(int id);
}
