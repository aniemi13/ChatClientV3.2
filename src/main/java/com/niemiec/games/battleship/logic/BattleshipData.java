package com.niemiec.games.battleship.logic;

import com.niemiec.chat.data.ChatData;
import com.niemiec.games.battleship.logic.processing.data.BattleshipProcessorData;
import com.niemiec.games.battleship.manager.BattleshipGamesManager;

public class BattleshipData {
	private BattleshipGamesManager battleshipGamesManager;
	private BattleshipProcessorData battleshipProcessorData;
	
	public BattleshipData(ChatData chatData) {
		battleshipGamesManager = new BattleshipGamesManager();
		battleshipProcessorData = new BattleshipProcessorData(chatData);
	}

	public BattleshipGamesManager getBattleshipGamesManager() {
		return battleshipGamesManager;
	}

	public BattleshipProcessorData getBattleshipProcessorData() {
		return battleshipProcessorData;
	}
}
